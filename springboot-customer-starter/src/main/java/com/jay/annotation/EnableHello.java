package com.jay.annotation;

import com.jay.config.SayHelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义启动注解
 *
 * @author xiang.wei
 * @date 2020/8/12 11:12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
//引入HelloConfig配置类
@Import({SayHelloWorldConfiguration.class})
public @interface EnableHello {

}
