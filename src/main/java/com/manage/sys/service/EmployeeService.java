package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;



public class EmployeeService {

    @Autowired
    EmployeeWrapper employeeWrapper;

    public void searchEmployeeByID(int id){
        employeeWrapper.searchEmployeeById(id);
    }
    public boolean addRole(RolePO rolePO){
        return employeeWrapper.addEmployee(rolePO)
    }

}
