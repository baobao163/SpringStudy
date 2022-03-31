package com.jack.config;

/**
 * @ClassName DiyPointcut
 * @Description Jack
 * @Author jack.bao
 * @Date 3/30/2022 9:42 AM
 * @Version 1.0
 **/
//自定义类来实现Aop
public class DiyPointcut {
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    public void after(){
        System.out.println("---------方法执行后---------");
    }
}
