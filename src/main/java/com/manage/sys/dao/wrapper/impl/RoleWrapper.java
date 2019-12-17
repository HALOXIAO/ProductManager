package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.RoleMapper;
import com.manage.sys.dao.wrapper.RoleWrapperInterface;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleWrapper implements RoleWrapperInterface {
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


}
