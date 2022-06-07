package com.example.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
//to create topics
public class KafkaTopicConfig {

    @Bean
    public NewTopic randomTopic(){
        return TopicBuilder.name("topic1").build();
    }
}
