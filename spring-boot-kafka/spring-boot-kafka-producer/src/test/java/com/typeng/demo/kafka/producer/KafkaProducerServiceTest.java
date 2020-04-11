package com.typeng.demo.kafka.producer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * KafkaProducerServiceTest.
 *
 * @author ty-peng
 * @date 2020-04-09 18:25
 */
@SpringBootTest
class KafkaProducerServiceTest {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage() {
        String topic = "demo";
        for (int i = 0; i < 10; i++) {
            kafkaProducerService.sendMessage(topic, "Message" + i);
        }
    }
}