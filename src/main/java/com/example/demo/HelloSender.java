package com.example.demo;

import lombok.extern.log4j.Log4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by xuw-e on 2018/4/18.
 */
@Component
@Log4j
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + LocalDateTime.now().toString();
        log.info("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
