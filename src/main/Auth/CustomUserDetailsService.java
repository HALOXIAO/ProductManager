package com.manage.sys.Auth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.config.status.ROLE_STATUS_CODE;
import com.manage.sys.dao.wrapper.UserWrapperInterface;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.entity.po.RolePO;
import com.manage.sys.entity.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;

@Configuration
public class CustomUserDetailsService implements UserDetailsService  {

    @Autowired
    UserWrapper userWrapper;

    @Autowired
    EmployeeWrapper employeeWrapper;

    @Autowired
    RoleWrapper roleWrapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        UserPO user = userWrapper.searchUser(queryWrapper);
        QueryWrapper<EmployeePO> employeeQueryWrapper = new QueryWrapper<>();
        employeeQueryWrapper.eq("internal_name", username);
        EmployeePO employee = employeeWrapper.searchEmployeeBySomeThing(employeeQueryWrapper);
        List<GrantedAuthority> list = new ArrayList<>();
        list.add( new SimpleGrantedAuthority(employee.getEmployeeTypeName()));
        return new User(username,user.getPassword(), Objects.equals(user.getStatus(), ROLE_STATUS_CODE.ROLE_STATUS_CODE_USE.getValue())
        ,true,true,true,list);
    }
}
