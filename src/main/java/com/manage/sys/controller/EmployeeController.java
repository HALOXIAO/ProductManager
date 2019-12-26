package com.manage.sys.controller;


import com.manage.sys.entity.PO.EmployeePO;
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

    @GetMapping("/all")
    @Cacheable()
    public ResultBean<List<EmployeePO>> getAllEmployee(@RequestParam("size") Long sum, @RequestParam("page") Long page) {
        employeeService.getEmployeeWithPage(sum, page);
        return new ResultBean<>();
    }

    @PostMapping()
    public ResultBean<Boolean> addEmployee(@Valid @RequestBody EmployeePO employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(employeeService.addEmployee(employee));

    }

    @GetMapping("/{employee}")
    @Cacheable("employee")
    public ResultBean<EmployeePO> getEmployee(@PathVariable("employee") String username) {
        return new ResultBean<>(employeeService.searchEmployeeByInternalName(username));
    }

    @PutMapping()
    @CacheEvict(value = "employee", key = "#employeePO.internalName")
    public ResultBean<Boolean> updateEmployee(@RequestBody EmployeePO employeePO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(employeeService.updateEmployee(employeePO));
    }

    @DeleteMapping("{employee}")
    @CacheEvict(value = "employee")
    public ResultBean<Boolean> deleteEmployee(@PathVariable String username) {
        if (employeeService.deleteEmployee(username)) {
            return new ResultBean<>(true);
        }
        return new ResultBean<>(false);
    }

}
