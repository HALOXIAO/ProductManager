package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.EmployeePO;

public interface EmployeeWrapperInterface {

    public Boolean addEmployee(EmployeePO employee);

    public EmployeePO searchEmployeeById(long id);
}
