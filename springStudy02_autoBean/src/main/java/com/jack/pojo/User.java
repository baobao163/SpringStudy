package com.jack.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @ClassName User
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 5:29 PM
 * @Version 1.0
 **/
public class User {
    @Autowired(required = false)
    private Cat cat;
//    @Autowired
//    @Qualifier("dog1")
    @Resource(name = "dog1")
    private Dog dog;

    private String str;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }
}
