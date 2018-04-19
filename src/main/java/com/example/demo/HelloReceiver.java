package com.example.demo;

import lombok.extern.log4j.Log4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by xuw-e on 2018/4/18.
 */
@Component
@RabbitListener(queues = "hello")
@Log4j
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver  : " + hello);
    }
}
