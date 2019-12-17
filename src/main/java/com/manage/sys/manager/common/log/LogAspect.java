package com.manage.sys.Manager.common.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

    @Before("execution(* com.manage.sys.controller..*.*(..))")
    public void test() {
    }
}
