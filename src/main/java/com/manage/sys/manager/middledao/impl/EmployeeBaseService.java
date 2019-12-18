package com.manage.sys.manager.middledao.impl;

import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.manager.middledao.EmployeeBaseServiceInterface;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;


public class EmployeeBaseService extends EmployeeWrapper implements EmployeeBaseServiceInterface {

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
