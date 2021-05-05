package com.sumforest.producer.service;

import com.sumforest.common.config.DirectRabbitConfig;
import com.sumforest.common.config.RabbitMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sen
 * @date 2021/5/4 20:14
 * @description
 */
@SpringBootApplication(scanBasePackageClasses = {ProducerApplication.class, DirectRabbitConfig.class, RabbitMQConfig.class})
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class);
    }
}
