package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper  {

    @Autowired
    private User userMapper;

    
    public Boolean addUser(UserPO user) {
        return null;
    }

    
    public Boolean deleteUser(UserPO user,UpdateWrapper<UserPO> updateWrapper) {
        user.setStatus(0);
        return updateUserByUsername(user,updateWrapper);
    }

    
    public Boolean updateUserByUsername(UserPO userPO, UpdateWrapper<UserPO> updateWrapper) {
        return userMapper.update(userPO, updateWrapper) == 1;
    }

    
    public UserPO searchUser(QueryWrapper<UserPO> wrapper) {
        return userMapper.selectOne(wrapper);
    }

}
