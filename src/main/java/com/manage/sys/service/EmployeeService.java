package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsByNameServiceWrapper;


public class EmployeeService {

    @Autowired
    EmployeeWrapper employeeWrapper;

    @Autowired
    UserDetailsByNameServiceWrapper userDetailsByNameServiceWrapper;

    public void searchEmployeeByID(int id){
        employeeWrapper.searchEmployeeById(id);
    }

    public boolean addEmployee(EmployeePO employeePO){
        return employeeWrapper.addEmployee(employeePO);
    }

    public boolean updateEmployee(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1=employeeWrapper.updateEmployee(employeePO);
        if(employeePO.getStatus()!=null){
            UpdateCondition<Integer,UserPO> updateCondition = new UpdateCondition<>();
            UpdateWrapper<UserPO> wrapper = updateCondition.updateEmployeeBy("status",employeePO.getStatus());
            boolean flag2 =true;
            return flag1 && flag2;
        }
        return flag1;
    }

}
