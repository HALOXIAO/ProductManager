package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.EmployeeRoleMapper;
import com.manage.sys.dao.wrapper.EmployeeRoleWrapperInterface;
import com.manage.sys.entity.po.EmployeeRolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRoleWrapper implements EmployeeRoleWrapperInterface {

    @Autowired
    EmployeeRoleMapper employeeRoleMapper;

    @Override
    public Boolean connectionEmployeeAndRole(EmployeeRolePO employeeRolePo) {
        return employeeRoleMapper.insert(employeeRolePo) == 1;
    }

}
