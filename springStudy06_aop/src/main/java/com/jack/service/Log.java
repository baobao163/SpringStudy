package com.jack.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName Log
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 6:14 PM
 * @Version 1.0
 **/
//一个前置增强
public class Log implements MethodBeforeAdvice {
    //Method : 要执行的目标对象的方法
    //Object[] : 被调用的方法的参数
    //Object : 目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
