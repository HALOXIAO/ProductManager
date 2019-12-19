package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.EmployeeWrapperInterface;
import com.manage.sys.dao.wrapper.RoleWrapperInterface;
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


    public void searchRoleById(int id) {
        roleWrapper.searchRoleById(id);
    }

    public Boolean addRole(RolePO rolePO) {
        return roleWrapper.createRole(rolePO);
    }


    public Boolean updateRole(RolePO rolePO) {
        roleWrapper.updateRole(rolePO);
        boolean flag1 = roleWrapper.updateRole(rolePO);
        if (!("").equals(rolePO.getRoleName())) {
            UpdateCondition updateCondition = new UpdateCondition();
            UpdateWrapper<EmployeePO> wrapper = updateCondition.updateEmployeeBy("role_name", rolePO.getRoleName());
            EmployeePO employee = new EmployeePO();
            employee.setEmployeeTypeName(rolePO.getRoleName());
            boolean flag2 = employeeWrapper.updateEmployeeBySomeThing(employee, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }
}
