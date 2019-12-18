package com.manage.sys.manager.middledao.impl;

import com.manage.sys.dao.wrapper.impl.EmployeeWrapperInterface;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.manager.middledao.EmployeeServiceInterface;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;


public class EmployeeService extends EmployeeWrapperInterface implements EmployeeServiceInterface {

    @Override
    public Boolean addEmployee(EmployeePO employee){
        return addEmployee(employee);
    }

    @Override
    public EmployeePO selectEmployee(EmployeePO employee){
        return searchEmployeeById(employee.getEmployeeId());
    }

    @Override
    public Boolean updateEmployee(EmployeePO employee){
        employee.setStatus(EMPLOYEE_STATUS_CODE_QUIT.ordinal());
        return updateEmployee(employee);
    }


}
