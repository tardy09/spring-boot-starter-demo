package com.jay.config;

import com.jay.annotation.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 重写match方法用于判断条件返回true或者false
 *
 * @return
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取注解属性
        Map<String, Object> attrs = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        //获取系统值
        String system = String.valueOf(attrs.get("value"));
        String currentOs = System.getProperty("os.name");
        boolean result = currentOs.contains(system);
        System.out.println("********currentOs=" + currentOs + "匹配结果是=" + result);
        return result;
    }

}
