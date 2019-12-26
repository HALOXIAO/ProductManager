package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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
    public Boolean deleteUser(UserPO user,UpdateWrapper<UserPO> updateWrapper) {
        user.setStatus(0);
        return updateUserByUsername(user,updateWrapper);
    }

    @Override
    public Boolean updateUserByUsername(UserPO userPO, UpdateWrapper<UserPO> updateWrapper) {
        return userMapper.update(userPO, updateWrapper) == 1;
    }

    @Override
    public UserPO searchUser(QueryWrapper<UserPO> wrapper) {
        return userMapper.selectOne(wrapper);
    }

}
