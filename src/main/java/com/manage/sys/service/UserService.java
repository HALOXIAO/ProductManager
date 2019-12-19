package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    UserWrapper userWrapper;
    @Autowired
    EmployeeService employeeService;

    public UserPO searchUserById(QueryWrapper<UserPO> wrapper){
        return userWrapper.searchUser(wrapper);
    }

    public boolean addUser(UserPO userPO){
        return userWrapper.addUser(userPO);
    }

    public void updateUserStatus(EmployeePO employeePO){
        employeeService.updateEmployeeStatusForUser(employeePO);
    }
}
