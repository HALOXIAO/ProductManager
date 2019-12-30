package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.QueryCondition;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleWrapper roleWrapper;

    @Autowired
    EmployeeWrapper employeeWrapper;

    public RolePO searchRoleByUsername(String username) {
        QueryWrapper<RolePO> wrapper = new QueryCondition<RolePO>().queryConditionBy("role_name", username);
        return roleWrapper.searchRoleBySomeThing(wrapper);
    }

    public Boolean deleteRole(String username){
        RolePO rolePO = new RolePO();
        rolePO.setRoleName(username);
        UpdateWrapper<RolePO> wrapper = new UpdateCondition<RolePO>().updateConditionByEqOne("role_name",username);
        return roleWrapper.deleteRoleBySomeThing(rolePO,wrapper);
    }

    public void searchRoleById(int id) {
        roleWrapper.searchRoleById(id);
    }

    public Boolean addRole(RolePO rolePO) {
        return roleWrapper.createRole(rolePO);
    }


    public Boolean updateRole(RolePO rolePO) {
        return roleWrapper.updateRoleBySomeThing(rolePO, new UpdateCondition<RolePO>().updateConditionByEqOne("role_name", rolePO.getRoleName()));
    }

    public Boolean updateRoleName(RolePO rolePO) {
        UpdateWrapper<EmployeePO> wrapper = new UpdateCondition<EmployeePO>().updateConditionByEqOne("employee_type_name", rolePO.getRoleName());
        EmployeePO employee = new EmployeePO();
        employee.setEmployeeTypeName(rolePO.getRoleName());
        Boolean employeeFlag = employeeWrapper.updateEmployeeBySomeThing(employee, wrapper);
        Boolean roleFlag = roleWrapper.updateRoleBySomeThing(rolePO, new UpdateCondition<RolePO>().updateConditionByEqOne("role_name", rolePO.getRoleName()));
        return employeeFlag && roleFlag;
    }

}
