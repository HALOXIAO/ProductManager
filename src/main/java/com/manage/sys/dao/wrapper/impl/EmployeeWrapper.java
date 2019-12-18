package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.dao.wrapper.EmployeeWrapperInterface;
import com.manage.sys.entity.PO.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWrapper implements EmployeeWrapperInterface {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Boolean addEmployee(EmployeePO employee) { return employeeMapper.save(employee); }

    @Override
    public EmployeePO searchEmployeeById(long id) {
        return employeeMapper.getById(id);
    }

    @Override
    public Boolean updateEmployee(EmployeePO employee) {
        return employeeMapper.update(employee,null);
    }
}
