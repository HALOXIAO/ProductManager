package com.manage.sys.Security.Authenication;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.entity.po.UserPO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class Realm extends AuthorizingRealm {

    @Resource
    UserWrapper userWrapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        UserPO user = userWrapper.searchUser(wrapper);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        return simpleAuthenticationInfo;
    }
}
