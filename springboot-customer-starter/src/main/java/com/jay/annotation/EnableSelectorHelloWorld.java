package com.jay.annotation;

import com.jay.config.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiang.wei
 * @date 2020/8/12 13:39
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({HelloWorldImportSelector.class})
public @interface EnableSelectorHelloWorld {

    boolean isLinux();
}
