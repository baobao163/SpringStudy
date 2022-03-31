package com.jack.service;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterLog
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 6:18 PM
 * @Version 1.0
 **/

public class AfterLog implements AfterReturningAdvice {
    //returnValue:返回值
    //method:被调用的方法
    //args:被调用方法的参数对象
    //Object: 被调用对象
    public void afterReturning(Object returnValue, Method method, Object[] args, Object o1) throws Throwable {
        System.out.println("执行了" + o1.getClass().getName() + "的" + method.getName() + "方法，返回值：" + returnValue);
    }
}
