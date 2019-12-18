package com.manage.sys.service.impl;

import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.BO.EmployeeBO;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.service.EmployeeServiceInterface;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;


public class EmployeeService  implements EmployeeServiceInterface {

    @Override
    public void AddEmployee(EmployeePO employee){
        EmployeeWrapper employeeWrapper=new EmployeeWrapper();
        employeeWrapper.addEmployee(employee);

    }

    @Override
    public void SelectEmployee(EmployeePO employee){
        EmployeeWrapper employeeWrapper=new EmployeeWrapper();
        employeeWrapper.searchEmployeeById(employee.getEmployeeId());
    }

    @Override
    public void UpdateEmployee(EmployeePO employee){
        EmployeeWrapper employeeWrapper=new EmployeeWrapper();
        employee.setStatus(EMPLOYEE_STATUS_CODE_QUIT.ordinal());
        employeeWrapper.updateEmployee(employee);
    }



}
