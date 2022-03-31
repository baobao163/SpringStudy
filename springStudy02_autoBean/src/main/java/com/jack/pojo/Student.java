package com.jack.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Student
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 11:24 AM
 * @Version 1.0
 **/
@Component("student")
// 相当于配置文件中 <bean id="student" class="当前注解的类"/>
public class Student {
    private String name;
    private int age;

    @Value("jack")
    public void setName(String name) {
        this.name = name;
    }

    @Value("24")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
