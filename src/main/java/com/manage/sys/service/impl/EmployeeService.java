package com.manage.sys.service.impl;

import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.BO.EmployeeBO;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.service.EmployeeServiceInterface;


public class EmployeeService implements EmployeeServiceInterface {

    @Override
    public void addEmployee(EmployeePO employee){
        EmployeeWrapper employeeWrapper=new EmployeeWrapper();
        employeeWrapper.addEmployee(employee)

    }

    @Override
    public void SelectEmployee(EmployeeWrapper employeewrapper){
        employeewrapper.searchEmployeeById(id);
    }

    @Override
    public void DeleteEmployee(EmployeeWrapper employeewrapper){

    }
}
