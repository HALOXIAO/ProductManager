package com.manage.sys.manager;

import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.entity.PO.UserPO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {


    private Long userId;
    private String username;
    private String telehone;
    private String password;
    private Long employeeId;
    private int status;
    private Timestamp registerTime;
    private List<Integer> roles;
    private Collection<? extends  GrantedAuthority> authorities;


    public static CustomUserDetails create(UserPO userPO, List<RolePO> roles,List<RolePO> permissions){
        List<Integer> roleId = roles.stream()
                .map(RolePO::getRoleId)
                .collect(Collectors.toList());

        List<GrantedAuthority> authorities = permissions.stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getRoleName()))
                .collect(Collectors.toList());
        return new CustomUserDetails();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {

        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
