package com.hzs.user_update_daemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class UserUpdateDaemonApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserUpdateDaemonApplication.class, args);
//
//		KafkaProducer producer = context.getBean(KafkaProducer.class);
//        producer.checkKafkaTemplateConfig();
//        RuleUpdate ruleUpdate = RuleUpdate.newBuilder()
//                .setRuleId("789")
//                .setRuleName("Sample Rule")
//                .setRuleVersion(1) // Set the rule version
//                .build();
//
//		// Example topic and message key
//		String topic = "RuleUpdate";
//		String key = "message-key";
//        System.out.println(topic);
//		// Send the Protobuf message using your KafkaSender
//        producer.sendProtobufMessage(topic, key, ruleUpdate);
//
//		// Close the application context when done
//		context.close();

    }

}
