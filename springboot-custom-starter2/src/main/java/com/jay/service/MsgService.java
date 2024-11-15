package com.jay.service;

/**
 * 定义业务类
 *
 * @author xiang.wei
 * @date 2020/8/12 14:57
 */
public class MsgService {

    private String url;

    private String content;

    public MsgService(String url, String content) {
        this.url = url;
        this.content = content;
    }

    public String sendMsg() {
        System.out.println("**********消息发送成功，地址=" + url + "，内容=" + content + "");
        return "消息发送成功，地址=" + url + "，内容=" + content + "";
    }

}
