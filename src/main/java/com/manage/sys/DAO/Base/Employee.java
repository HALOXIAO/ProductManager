package com.manage.sys.DAO.Base;

import com.manage.sys.DAO.Employee_Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    Employee_Mapper employee_mapper;

    public static class Builder{

    }

}
