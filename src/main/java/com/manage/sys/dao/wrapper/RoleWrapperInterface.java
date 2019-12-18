package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.entity.PO.UserPO;

import java.util.List;

public interface RoleWrapperInterface {

    Boolean createRole(RolePO role);

    RolePO searchRoleById(int id);

    Boolean updateRole(RolePO role);

    public Boolean deleteRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> updateWrapper);

    public RolePO searchRoleBySomeThing(QueryWrapper<RolePO> wrapper);

    public List<RolePO> getAllRole();

    public Boolean deleteRole(RolePO role);
}
