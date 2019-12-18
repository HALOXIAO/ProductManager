package com.manage.sys.service;



import com.manage.sys.entity.PO.EmployeePO;


public interface EmployeeServiceInterface {
    public void addEmployee(EmployeePO employee);

    public void selectEmployee(EmployeePO employee);

    public void updateEmployee(EmployeePO employee);
}
