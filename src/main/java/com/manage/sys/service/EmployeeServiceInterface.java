package com.manage.sys.service;



import com.manage.sys.entity.PO.EmployeePO;


public interface EmployeeServiceInterface {
    public void AddEmployee(EmployeePO employee);

    public void SelectEmployee(EmployeePO employee);

    public void UpdateEmployee(EmployeePO employee);
}
