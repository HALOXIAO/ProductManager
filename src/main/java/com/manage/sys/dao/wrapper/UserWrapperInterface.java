package com.manage.sys.dao.wrapper;


import com.manage.sys.entity.PO.UserPO;

public interface UserWrapperInterface {

    public Boolean addUser(UserPO user);

    public Boolean deleteUser(UserPO user);

    public Boolean updateUser(UserPO userPO);
}
