package com.manage.sys.dao.wrapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.entity.PO.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface UserWrapperInterface {

    public Boolean addUser(UserPO user);

    public Boolean deleteUser(UserPO user);

    public Boolean updateUser(UserPO user);
    public UserPO searchUser(QueryWrapper<UserPO> wrapper);

    }
