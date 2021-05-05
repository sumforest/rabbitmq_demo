package com.sumforest.producer.service.controller;

import com.sumforest.producer.service.RabbitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sen
 * @date 2021/5/4 20:09
 * @description
 */
@RestController
public class RabbitMQController {

    @Resource
    private RabbitService rabbitService;

    @PostMapping("sendMsg")
    public String sendMsg(String msg){
        return rabbitService.sendMsg(msg);
    }
}
