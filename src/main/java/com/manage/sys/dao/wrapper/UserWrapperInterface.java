package com.manage.sys.dao.wrapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.UserPO;

public interface UserWrapperInterface {

    public Boolean addUser(UserPO user);

    public Boolean deleteUser(UserPO user, UpdateWrapper<UserPO> updateWrapper);

    public Boolean updateUserByUsername(UserPO userPO, UpdateWrapper<UserPO> updateWrapper);

    public UserPO searchUser(QueryWrapper<UserPO> wrapper);

}
