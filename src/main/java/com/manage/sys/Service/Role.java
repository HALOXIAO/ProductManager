package com.manage.sys.Service;

import com.manage.sys.DAO.RoleMapper;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Role {
    @Autowired
    RoleMapper roleMapper;

    public boolean createRole(String name, int status) {
        RolePO role = new RolePO();
        role.setRoleName(name);
        role.setStatus(status);
        return roleMapper.save(role);
    }

    public boolean createRole(String name, int status, String description) {
        RolePO role = new RolePO();
        role.setRoleName(name);
        role.setStatus(status);
        return roleMapper.save(role);
    }

    public boolean changeStatus(int id, int status) {
        RolePO role = new RolePO();
        role.setStatus(status);
        role.setRoleId(id);
        return roleMapper.updateById(role);
    }

}
