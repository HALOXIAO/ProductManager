package com.manage.sys.service.impl;

import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.service.RoleServiceInterface;

import static com.manage.sys.config.status.ROLE_STATUS_CODE.ROLE_STATUS_CODE_ABUNDANT;


public class RoleService implements RoleServiceInterface {

    @Override
    public void Addrole(RolePO role){
        RoleWrapper roleWrapper=new RoleWrapper();
        roleWrapper.createRole(role);
    }

    @Override
    public void Selectrole(RolePO role){
        RoleWrapper roleWrapper=new RoleWrapper();
        roleWrapper.searchRoleById(role.getRoleId());
    }

    @Override
    public void Updaterole(RolePO role){
        RoleWrapper roleWrapper=new RoleWrapper();
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        roleWrapper.updateRole(role);
    }
}
