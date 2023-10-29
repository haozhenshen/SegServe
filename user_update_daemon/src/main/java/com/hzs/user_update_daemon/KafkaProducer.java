package com.hzs.user_update_daemon;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class KafkaProducer {

    private final KafkaTemplate<String, byte[]> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public <T extends com.google.protobuf.Message> void sendProtobufMessage(String topic, String key, T message) {
        byte[] messageBytes = message.toByteArray();
        kafkaTemplate.send(topic, key, messageBytes);
    }
    public void checkKafkaTemplateConfig() {
        // Access the KafkaTemplate's producer factory
        ProducerFactory<String, byte[]> producerFactory = kafkaTemplate.getProducerFactory();

        // Access the producer configs
        Map<String, Object> producerConfigs = producerFactory.getConfigurationProperties();

        // Print or inspect the producer configs
        System.out.println("Kafka Producer Configs:");
        producerConfigs.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}