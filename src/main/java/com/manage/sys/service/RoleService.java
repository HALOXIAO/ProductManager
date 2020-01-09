package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.entity.po.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleWrapper roleWrapper;

    @Autowired
    EmployeeWrapper employeeWrapper;

    public RolePO searchRoleByUsername(String username) {
        QueryWrapper<RolePO> wrapper = new QueryWrapper<RolePO>().eq("role_name", username);
        return roleWrapper.searchRoleBySomeThing(wrapper);
    }

    public Boolean deleteRole(String username) {
        RolePO rolePO = new RolePO();
        rolePO.setRoleName(username);
        UpdateWrapper<RolePO> wrapper = new UpdateWrapper<RolePO>().eq("role_name", username);
        return roleWrapper.deleteRoleBySomeThing(rolePO, wrapper);
    }

    public void searchRoleById(int id) {
        roleWrapper.searchRoleById(id);
    }

    public Boolean addRole(RolePO rolePO) {
        return roleWrapper.createRole(rolePO);
    }


    public Boolean updateRole(RolePO rolePO) {
        if (rolePO.getRoleId() != null) {
            return roleWrapper.updateRoleBySomeThing(rolePO, new UpdateWrapper<RolePO>().eq("role_id", rolePO.getRoleId()));
        } else if (rolePO.getRoleName() != null) {
            return roleWrapper.updateRoleBySomeThing(rolePO, new UpdateWrapper<RolePO>().eq("role_name", rolePO.getRoleName()));
        }
        return Boolean.FALSE;
    }



}
