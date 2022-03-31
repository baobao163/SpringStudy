package com.jack.demo01_rent.client;

import com.jack.demo01_rent.abs.Rent;
import com.jack.demo01_rent.host.Host;
import com.jack.demo01_rent.proxy.ProxyInvocationHandler;

/**
 * @ClassName Client
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 4:36 PM
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host); //将真实角色放置进去！
        Rent proxy = (Rent) pih.getProxy(); //
    }
}
