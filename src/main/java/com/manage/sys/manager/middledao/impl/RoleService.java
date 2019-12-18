package com.manage.sys.manager.middledao.impl;

import com.manage.sys.dao.wrapper.RoleWrapperInterface;
import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.manager.middledao.RoleServiceInterface;

import static com.manage.sys.config.status.ROLE_STATUS_CODE.ROLE_STATUS_CODE_ABUNDANT;


public class RoleService extends RoleWrapper implements RoleServiceInterface {

    @Override
    public Boolean addRole(RolePO role) {
        return createRole(role);
    }

    @Override
    public RolePO selectRole(RolePO role) {
        return searchRoleById(role.getRoleId());
    }

    @Override
    public Boolean updateRole(RolePO role) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        return updateRole(role);

    }
}
