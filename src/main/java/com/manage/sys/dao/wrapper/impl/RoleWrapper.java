package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.RoleMapper;
import com.manage.sys.dao.wrapper.RoleWrapperInterface;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;
import static com.manage.sys.config.status.ROLE_STATUS_CODE.ROLE_STATUS_CODE_ABUNDANT;

@Component
public class RoleWrapper implements RoleWrapperInterface {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public Boolean createRole(RolePO role) {
        int flag = roleMapper.insert(role);
        return 1== flag;
    }


    @Override
    public RolePO searchRoleById(int id) {
        return roleMapper.selectById(id);
    }

    @Override
    public Boolean updateRoleBySomeThing(RolePO role,UpdateWrapper<RolePO>wrapper) {
        int flag= roleMapper.update(role, wrapper);
        return 1 == flag;
    }


    @Override
    public Boolean deleteRole(RolePO role,UpdateWrapper<RolePO>wrapperUpdateWrapper) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        return updateRoleBySomeThing(role,wrapperUpdateWrapper);
    }

    @Override
    public Boolean updateRoleById(RolePO rolePO) {
        return roleMapper.updateById(rolePO)==1;
    }

    @Override
    public Boolean deleteRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> updateWrapper) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        return updateRoleBySomeThing(role,updateWrapper);
    }

    @Override
    public RolePO searchRoleBySomeThing(QueryWrapper<RolePO> wrapper) {
        return roleMapper.selectOne(wrapper);
    }

    @Override
    public List<RolePO> getAllRole() {
        return null;
    }
}
