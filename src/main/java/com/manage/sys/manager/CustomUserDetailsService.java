package com.manage.sys.manager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.wrapper.UserWrapperInterface;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {

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
        employee.getEmployeeTypeName();
        List<String> permission = List.of(employee.getEmployeeTypeName());
        return CustomUserDetails.create(user, employee, permission);
    }
}
