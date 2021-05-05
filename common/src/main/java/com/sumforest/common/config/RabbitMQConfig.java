package com.sumforest.common.config;

/**
 * @author sen
 * @date 2021/5/4 19:13
 * @description
 */
public class RabbitMQConfig {

    /**
     * RabbitMQ的队列主题名称
     */
    public static final String RABBITMQ_DEMO_TOPIC = "rabbitmq.demo.topic";

    /**
     * RabbitMQ的DIRECT交换机名称
     */
    public static final String RABBITMQ_DEMO_DIRECT_EXCHANGE = "rabbitmq.demo.direct.exchange";

    /**
     * RabbitMQ的DIRECT交换机和队列绑定的匹配键 DirectRouting
     */
    public static final String RABBITMQ_DEMO_DIRECT_ROUTING = "rabbitmq.demo.direct.routing";
}
