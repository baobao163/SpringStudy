package com.jack.pojo;

/**
 * @ClassName User
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 5:12 PM
 * @Version 1.0
 **/
public class User {
    private String name;
    public User() {
        System.out.println("user无参构造方法");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+ name );
    }
}
