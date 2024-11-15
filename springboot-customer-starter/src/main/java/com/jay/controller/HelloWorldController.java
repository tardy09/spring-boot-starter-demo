package com.jay.controller;

import com.jay.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiang.wei
 * @date 2020/8/12 15:31
 */
@RestController
public class HelloWorldController {
    @Autowired
    private MsgService msgService;

    @RequestMapping(value = "/testSendMsg")
    public String testSendMsg() {
        String sendMsg = msgService.sendMsg();
        return sendMsg;
    }
}
