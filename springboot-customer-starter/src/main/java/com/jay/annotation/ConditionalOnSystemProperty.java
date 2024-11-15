package com.jay.annotation;

import com.jay.config.OnSystemPropertyCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiang.wei
 * @date 2020/8/12 14:02
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnSystemPropertyCondition.class})
public @interface ConditionalOnSystemProperty {
    /**
     * @return
     */
    String value();
}
