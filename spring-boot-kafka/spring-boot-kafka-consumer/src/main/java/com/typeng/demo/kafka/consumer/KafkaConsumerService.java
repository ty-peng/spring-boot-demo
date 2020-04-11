package com.typeng.demo.kafka.consumer;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Kafka 消费者.
 *
 * @author ty-peng
 * @date 2020-04-09 18:07
 */
@Slf4j
@Component
public class KafkaConsumerService {

    @KafkaListener(groupId = "group", topics = "demo")
    public void onMessage(ConsumerRecord<String, Object> record, Acknowledgment acknowledgment, Consumer<?, ?> consumer) {
        log.info("消费端接收消息：{}", record.value());
        // 手动签收
        acknowledgment.acknowledge();
    }
}
