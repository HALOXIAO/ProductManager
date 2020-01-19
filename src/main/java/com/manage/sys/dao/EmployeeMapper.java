package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.sys.entity.po.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;

@Component
public class EmployeeMapper  {

    @Autowired
    private Employee employee;

    
    public Boolean addEmployee(EmployeePO employee) {
        return this.employee.insert(employee) == 1;
    }

    
    public EmployeePO searchEmployeeById(long id) {
        return employee.selectById(id);
    }

    
    public Boolean updateEmployee(EmployeePO employee) {
        return this.employee.update(employee, null) == 1;
    }

    
    public List<EmployeePO> searchEmployeeWithPage(Long sum, Long page, QueryWrapper<EmployeePO> wrapper) {
        IPage<EmployeePO> iPage = new Page<EmployeePO>().setPages(page).setSize(sum);
        List<EmployeePO> list = employee.selectPage(iPage, wrapper).getRecords();
        return list;
    }

    
    public EmployeePO searchEmployeeBySomeThing(QueryWrapper<EmployeePO> queryWrapper) {
        return employee.selectOne(queryWrapper);
    }

    
    public Boolean updateEmployeeBySomeThing(EmployeePO entity, UpdateWrapper<EmployeePO> updateWrapper) {
        return employee.update(entity, updateWrapper) == 1;
    }

    
    public Boolean deleteEmployee(EmployeePO employee, UpdateWrapper<EmployeePO> updateWrapper) {
        employee.setStatus(EMPLOYEE_STATUS_CODE_QUIT.ordinal());
        return this.employee.update(employee, updateWrapper) == 1;
    }




}
