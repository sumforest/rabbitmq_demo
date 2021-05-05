package com.sumforest.consumer.hander;

import com.sumforest.common.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author sen
 * @date 2021/5/4 20:22
 * @description
 */
@Component
@RabbitListener(queues = {RabbitMQConfig.RABBITMQ_DEMO_TOPIC})
//使用queuesToDeclare属性，如果不存在则会创建队列
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConfig.RABBITMQ_DEMO_TOPIC))
public class RabbitDemoConsumer {

    @RabbitHandler
    public void consume(Map<String, Object> map) {
        System.out.println("消费者接收到消息:" + map.toString());
    }
}
