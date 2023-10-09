package com.aop_programming.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Before("execution(String com.aop_programming.demo.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Thuc hien truoc khi goi method: {}", joinPoint);
    }

}
