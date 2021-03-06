package com.manage.sys.controller;


import com.manage.sys.entity.convert.EmployeeFrontConvertToPo;
import com.manage.sys.entity.front.EmployeeFront;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    /**
     * 当需求5w条数据以上的时候，需要对分页查询方法进行优化
     */
    @GetMapping("/all")
    @Cacheable("employee")
    public ResultBean<List<EmployeePO>> getAllEmployee(@RequestParam("size") Long sum, @RequestParam("page") Long page) {
        return new ResultBean<>(employeeService.getEmployeeWithPage(sum, page));
    }

    @PostMapping()
    public ResultBean<Boolean> addEmployee(@Valid @RequestBody EmployeeFront employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        EmployeePO employeePO = EmployeeFrontConvertToPo.INSTANCE.employeeFrontToEmployeePo(employee);
        return new ResultBean<>(employeeService.addEmployee(employeePO, employee.getRoleId()));
    }


    @GetMapping("/{employee}")
    @Cacheable("employee")
    public ResultBean<EmployeePO> searchEmployee(@PathVariable("employee") String username) {
        return new ResultBean<>(employeeService.searchEmployeeByInternalName(username));
    }

    @PutMapping()
    @CacheEvict(value = "employee", key = "#employeePO.internalName")
    public ResultBean<Boolean> updateEmployee(@RequestBody EmployeeFront employeeFront, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        EmployeePO employee = EmployeeFrontConvertToPo.INSTANCE.employeeFrontToEmployeePo(employeeFront);
        return new ResultBean<>(employeeService.updateEmployee(employee));
    }

    @DeleteMapping("/{employee}")
    @CacheEvict(value = "employee")
    public ResultBean<Boolean> deleteEmployee(@PathVariable String username) {
        if (employeeService.deleteEmployee(username)) {
            return new ResultBean<>(true);
        }
        return new ResultBean<>(false);
    }

}
