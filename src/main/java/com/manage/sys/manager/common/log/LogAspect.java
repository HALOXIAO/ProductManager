package com.manage.sys.manager.common.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LogAspect {

    @Before("execution(* com.manage.sys.controller.AuthController.login(..))")
    public void LoginLog() {

    }


}