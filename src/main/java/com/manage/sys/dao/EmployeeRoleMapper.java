package com.manage.sys.dao;

import com.manage.sys.entity.po.EmployeeRolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRoleMapper  {

    @Autowired
    EmployeeRole employeeRoleMapper;

    public Boolean connectionEmployeeAndRole(EmployeeRolePO employeeRolePo) {
        return employeeRoleMapper.insert(employeeRolePo) == 1;
    }

}
