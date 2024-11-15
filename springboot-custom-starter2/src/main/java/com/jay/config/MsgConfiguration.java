package com.jay.config;

import com.jay.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author xiang.wei
 * @date 2020/8/12 15:05
 */
@Configuration
@ConditionalOnClass(MsgService.class)
@EnableConfigurationProperties(MsgProperties.class)
public class MsgConfiguration {
    /**
     * 注入属性类
     */
    @Autowired
    private MsgProperties msgProperties;

    /**
     * @Bean表明该方法实例化的对象会被加载到容器当中；
     * @ConditionalOnMissingBean指明当容器中不存在MsgService的对象时再进行实例化；
     * @ConditionalOnProperty指定了配置文件中msg.enabled=true时才进行相应的实例化。
     * @return
     */
    @Bean
    @ConditionalOnMissingBean({MsgService.class})
    //@ConditionalOnProperty(prefix = "msg")
    public MsgService msgService() {
        return new MsgService(msgProperties.getUrl(), msgProperties.getContent());
    }
}
