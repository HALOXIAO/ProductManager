package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.RolePO;

import java.util.List;

public interface RoleWrapperInterface {

    Boolean createRole(RolePO role);

    RolePO searchRoleById(int id);

    public Boolean updateRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> wrapper);

    public Boolean deleteRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> updateWrapper);

    public RolePO searchRoleBySomeThing(QueryWrapper<RolePO> wrapper);

    public List<RolePO> getAllRole();

    public Boolean deleteRole(RolePO role, UpdateWrapper<RolePO> wrapperUpdateWrapper);

    Boolean updateRoleById(RolePO rolePO);
}
