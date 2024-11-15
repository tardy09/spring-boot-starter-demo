package com.jay.config;

import com.jay.annotation.EnableSelectorHelloWorld;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * 条件选择器，实现ImportSelector接口，并实现selectImports方法
 *
 * @author xiang.wei
 * @date 2020/8/12 13:40
 */
public class HelloWorldImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //获取注解上的属性
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(EnableSelectorHelloWorld.class.getName());
        Boolean isLinux = (Boolean) annotationAttributes.get("isLinux");
        return new String[]{isLinux ? SayHelloWorldConfiguration.class.getName() : SayHelloWorldConfiguration2.class.getName()};
    }

}
