package com.jack.pojo;

/**
 * @ClassName UserT
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 5:18 PM
 * @Version 1.0
 **/
public class UserT {
    private String name;

    public UserT(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
