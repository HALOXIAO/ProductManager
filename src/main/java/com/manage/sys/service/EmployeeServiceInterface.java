package com.manage.sys.service;



import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.PO.EmployeePO;


public interface EmployeeServiceInterface {
    public void AddEmployee(EmployeeWrapper employeewrapper);

    public void SelectEmployee(EmployeeWrapper employeewrapper);

    public void DeleteEmployee(EmployeeWrapper employeewrapper);
}