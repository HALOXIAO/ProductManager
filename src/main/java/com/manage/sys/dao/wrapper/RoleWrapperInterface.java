package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.RolePO;

public interface RoleWrapperInterface {

    public Boolean createRole(RolePO role);

    public RolePO searchRoleById(int id);

    public Boolean updateRole(RolePO role);

}
