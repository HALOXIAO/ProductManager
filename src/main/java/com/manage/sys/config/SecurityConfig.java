package com.manage.sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author HALOXIAO
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .and().csrf()
                .and().httpBasic().disable()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .logout().disable()
                .formLogin().loginProcessingUrl("/login");
    }

}
