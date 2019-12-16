package com.manage.sys.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author HALOXIAO
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .and().csrf()
                .and().httpBasic().disable()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and().logout().disable()
                .formLogin().loginProcessingUrl("/login");
    }

}
