package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.RoleMapper;
import com.manage.sys.dao.wrapper.RoleWrapperInterface;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;
import static com.manage.sys.config.status.ROLE_STATUS_CODE.ROLE_STATUS_CODE_ABUNDANT;

@Service
public  class RoleWrapper implements RoleWrapperInterface {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public Boolean createRole(RolePO role) {
        return roleMapper.save(role);
    }

    @Override
    public RolePO searchRoleById(int id) {
        return roleMapper.getById(id);
    }

    @Override
    public Boolean updateRole(RolePO role) {
        return roleMapper.update(role,null);
    }

    @Override
    public Boolean deleteRole(RolePO role) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        return updateRole(role);
    }


}
