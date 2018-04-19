package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuw-e on 2018/4/18.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello");
    }
}
