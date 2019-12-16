package com.manage.sys.service;

import com.manage.sys.dao.Employee_Mapper;
import com.manage.sys.entity.PO.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeOperation {

    @Autowired
    Employee_Mapper employee_mapper;

    public String addEmployee(EmployeePO employee){
        if (employee_mapper.save(employee)){
            return "";
        }

        return "";
    }
}
