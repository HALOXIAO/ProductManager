package com.manage.sys.Auth;

import com.manage.sys.config.status.ROLE_STATUS_CODE;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.UserPO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class CustomUserDetails {

//
//    private String username;
//    private String password;
//    private Long employeeId;
//    private int status;
//    /**
//     * 权限列表
//     */
//    private Collection<? extends GrantedAuthority> authorities;
//
//
//    public static CustomUserDetails create(UserPO user, EmployeePO employee, List<String> permissions) {
//        List<GrantedAuthority> authorities = permissions.stream()
//                .map(permission -> new SimpleGrantedAuthority(employee.getEmployeeTypeName()))
//                .collect(Collectors.toList());
//
//
//        return new CustomUserDetails(user.getUsername(), user.getPassword(), user.getEmployeeId(), user.getStatus(), authorities);
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return Objects.equals(this.status, ROLE_STATUS_CODE.ROLE_STATUS_CODE_USE.getValue());
//    }
}
