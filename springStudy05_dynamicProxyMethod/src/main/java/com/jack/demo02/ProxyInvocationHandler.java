package com.jack.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 5:21 PM
 * @Version 1.0
 **/

//写一个万能的动态代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //获取动态代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader()
                , target.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());

        Object result = method.invoke(target, args);
        return result;
    }

    //增加日志功能
    public void log(String msg) {
        System.out.println("执行" + msg + "操作");
    }
}
