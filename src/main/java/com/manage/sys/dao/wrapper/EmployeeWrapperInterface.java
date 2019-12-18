package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.EmployeePO;

public interface EmployeeWrapperInterface {

    Boolean addEmployee(EmployeePO employee);

    EmployeePO searchEmployeeById(long id);

    Boolean updateEmployee(EmployeePO employee);
}
