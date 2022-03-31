package com.jack.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AnnotationPointcut
 * @Description Jack
 * @Author jack.bao
 * @Date 3/30/2022 10:12 AM
 * @Version 1.0
 **/
//第三种方式
//使用注解实现

//第一步：编写一个注解实现的增强类
@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.jack.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("---------方法执行前---------");
    }

    @After("execution(* com.jack.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("---------方法执行后---------");
    }

    @Around("execution(* com.jack.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:" + jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
