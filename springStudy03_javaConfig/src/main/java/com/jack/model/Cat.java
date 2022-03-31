package com.jack.model;

import org.springframework.stereotype.Component;

/**
 * @ClassName Cat
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 2:24 PM
 * @Version 1.0
 **/
@Component //将这个类标注为Spring的一个组件，放到容器中！
public class Cat {
    public String name = "cat";
}
