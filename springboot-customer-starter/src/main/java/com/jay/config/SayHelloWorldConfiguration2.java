package com.jay.config;

import com.jay.annotation.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Bean;

/**
 * @author xiang.wei
 * @date 2020/8/12 14:08
 */
public class SayHelloWorldConfiguration2 {
    /**
     * @return
     */
    @ConditionalOnSystemProperty(value = "Windows")
    @Bean
    SayHelloWorld sayHelloWorld() {
        System.out.println("*********开始装配SayHelloWorld");
        return new SayHelloWorld();
    }
}
