package com.manage.sys.manager.middledao;

import com.manage.sys.entity.PO.RolePO;



/**
 * Role的基础操作
 * */
public interface RoleBaseServiceInterface {
    public Boolean addRole(RolePO role);

    public RolePO selectRole(RolePO role);

    public Boolean updateRole(RolePO role);

}
