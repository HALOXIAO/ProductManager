package com.manage.sys.manager.common.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

    @Before("execution(* com.manage.sys.controller..*.*(..))")
    public void test() {
        Logger logger = LoggerFactory.getLogger(Object.class);
        
    }
}
