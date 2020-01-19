package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.manage.sys.config.status.ROLE_STATUS_CODE.ROLE_STATUS_CODE_ABUNDANT;

@Component
public class RoleMapper {
    @Autowired
    Role roleMapper;


    public Boolean createRole(RolePO role) {
        int flag = roleMapper.insert(role);
        return 1 == flag;
    }


    public RolePO searchRoleById(int id) {
        return roleMapper.selectById(id);
    }


    public Boolean updateRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> wrapper) {
        int flag = roleMapper.update(role, wrapper);
        return 1 == flag;
    }


    public Boolean deleteRole(RolePO role, UpdateWrapper<RolePO> wrapperUpdateWrapper) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.getValue());
        return updateRoleBySomeThing(role, wrapperUpdateWrapper);
    }


    public Boolean updateRoleById(RolePO rolePO) {
        return roleMapper.updateById(rolePO) == 1;
    }


    public Boolean deleteRoleBySomeThing(RolePO role, UpdateWrapper<RolePO> updateWrapper) {
        role.setStatus(ROLE_STATUS_CODE_ABUNDANT.ordinal());
        return updateRoleBySomeThing(role, updateWrapper);
    }


    public RolePO searchRoleBySomeThing(QueryWrapper<RolePO> wrapper) {
        return roleMapper.selectOne(wrapper);
    }


    public List<RolePO> getAllRole() {
        return null;
    }
}
