package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.UserMapper;
import com.manage.sys.dao.wrapper.UserWrapperInterface;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserWrapper implements UserWrapperInterface {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean addUser(UserPO user) {
        return null;
    }

    @Override
    public Boolean deleteUser(UserPO user) {
        return null;
    }

    @Override
    public Boolean updateUser(UserPO userPO) {
        return null;
    }

    @Override
    public UserPO searchUser(QueryWrapper<UserPO>wrapper){
        return userMapper.selectOne(wrapper);
    }

}
