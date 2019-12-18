package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.entity.PO.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<EmployeePO> updateAllEmployee(EmployeePO employeePO){

    }
}
