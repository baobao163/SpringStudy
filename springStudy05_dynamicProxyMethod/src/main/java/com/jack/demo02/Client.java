package com.jack.demo02;

/**
 * @ClassName Client
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 3:57 PM
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //真实业务类
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //放入真实角色
        pih.setTarget(userService);
        //获取动态代理对象
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
    }
}
