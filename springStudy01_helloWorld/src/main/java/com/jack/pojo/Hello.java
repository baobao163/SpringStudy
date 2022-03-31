package com.jack.pojo;

/**
 * @ClassName Hello
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 4:08 PM
 * @Version 1.0
 **/
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Hello," + name);
    }
}
