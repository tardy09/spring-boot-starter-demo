package com.jay.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 定义属性类
 *
 * @author xiang.wei
 * @date 2020/8/12 14:57
 */
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {
    /**
     * 消息发送地址
     */
    private String url;
    /**
     * 发送内容
     */
    private String content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
