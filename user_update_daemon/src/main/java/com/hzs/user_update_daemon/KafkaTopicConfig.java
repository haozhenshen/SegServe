package com.hzs.user_update_daemon;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private String topicName = "test";

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(topicName).build();
    }

//    @Bean
//    public void setTopicName(NewTopic topicName) {
//        this.topicName = topicName;
//    }

}
