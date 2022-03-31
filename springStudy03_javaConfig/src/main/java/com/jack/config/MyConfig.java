package com.jack.config;

import com.jack.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName javaConfig
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 2:20 PM
 * @Version 1.0
 **/
@Configuration
@Import(MyConfig2.class) //导入合并其他配置类，类似于配置文件中include标签
public class MyConfig {
    /**
     * 使用javaConfig进行配置bean配置
     **/

    @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean
    public Cat cat() {
        return new Cat();
    }

}
