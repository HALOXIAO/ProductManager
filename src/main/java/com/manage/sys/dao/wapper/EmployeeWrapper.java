package com.manage.sys.dao.wapper;

import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.entity.PO.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWrapper {

    @Autowired
    EmployeeMapper employeeMapper;

    public Boolean addEmployee(EmployeePO employee) {
        return employeeMapper.save(employee);
    }

    public Boolean updateEmployee(EmployeePO employee) {

    }

    public EmployeePO searchEmployeeById(long id) {
        return employeeMapper.getById(id);
    }


}
