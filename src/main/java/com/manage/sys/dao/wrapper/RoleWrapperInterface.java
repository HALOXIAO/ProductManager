package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.RolePO;

public interface RoleWrapperInterface {

   Boolean createRole(RolePO role);

  RolePO searchRoleById(int id);

   Boolean updateRole(RolePO role);

}
