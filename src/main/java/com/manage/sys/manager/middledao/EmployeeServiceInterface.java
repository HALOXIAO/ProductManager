package com.manage.sys.manager.middledao;



import com.manage.sys.entity.PO.EmployeePO;

/**
 * Employee的基础操作
 * */
public interface EmployeeServiceInterface {
    public Boolean addEmployee(EmployeePO employee);

    public EmployeePO selectEmployee(EmployeePO employee);

    public Boolean updateEmployee(EmployeePO employee);
}
