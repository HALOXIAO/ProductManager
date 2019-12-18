package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.entity.PO.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;

@Service
public  class EmployeeWrapper implements com.manage.sys.dao.wrapper.EmployeeWrapperInterface {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Boolean addEmployee(EmployeePO employee) {
        return null;
    }

    @Override
    public EmployeePO searchEmployeeById(long id) {
        return employeeMapper.getById(id);
    }

    @Override
    public Boolean updateEmployee(EmployeePO employee) {
        return employeeMapper.update(employee,null);
    }


    @Override
    public EmployeePO searchEmployeeBySomeThing( QueryWrapper<EmployeePO> queryWrapper) {
        return employeeMapper.getOne(queryWrapper);
    }

    @Override
    public Boolean updateEmployeeBySomeThing(EmployeePO entity,UpdateWrapper<EmployeePO> updateWrapper) {
        return employeeMapper.update(entity,updateWrapper);
    }

    @Override
    public Boolean deleteEmployee(EmployeePO employee,UpdateWrapper<EmployeePO> updateWrapper){
        employee.setStatus(EMPLOYEE_STATUS_CODE_QUIT.ordinal());
        return employeeMapper.update(employee,updateWrapper);
    }
}
