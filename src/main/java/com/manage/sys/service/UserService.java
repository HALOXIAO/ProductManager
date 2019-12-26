package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserWrapper userWrapper;
    @Autowired
    EmployeeService employeeService;


    public UserPO searchUserById(Integer id) {
        return new UserPO();
    }


    public Boolean addUser(UserPO userPO) {
        return userWrapper.addUser(userPO);
    }

    public Boolean updateUser(UserPO userPO) {
        UpdateWrapper<UserPO> wrapper = new UpdateCondition<UserPO>().updateConditionByEqOne("username", userPO.getUsername());
        return userWrapper.updateUserByUsername(userPO, wrapper);
    }

    public Boolean deleteUser(String username) {
        UserPO userPO = new UserPO();
        userPO.setUsername(username);
        UpdateWrapper<UserPO>wrapper = new UpdateCondition<UserPO>().updateConditionByEqOne("username",username);
        return userWrapper.deleteUser(userPO,wrapper);
    }
}
