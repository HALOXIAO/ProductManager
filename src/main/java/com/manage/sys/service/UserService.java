package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.po.UserPO;
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
        UpdateWrapper<UserPO> wrapper = new UpdateWrapper<UserPO>().eq("username", userPO.getUsername());
        return userWrapper.updateUserByUsername(userPO, wrapper);
    }

    public Boolean deleteUser(String username) {
        UserPO userPO = new UserPO();
        UpdateWrapper<UserPO> wrapper = new UpdateWrapper<UserPO>().eq("username", username);
        return userWrapper.deleteUser(userPO, wrapper);
    }
}
