package com.jay.config;

import org.springframework.context.annotation.Bean;

/**
 * 不带条件的注解
 *
 * @author xiang.wei
 * @date 2020/8/12 11:15
 */
public class SayHelloWorldConfiguration {
    @Bean
    SayHelloWorld sayHelloWorld() {
        System.out.println("********加载HelloConfig");
        return new SayHelloWorld();
    }
}
