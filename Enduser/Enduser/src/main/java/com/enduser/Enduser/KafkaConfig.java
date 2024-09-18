package com.enduser.Enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;



@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstant.location_update_topic,groupId =AppConstant.groupId)
    public void updateLocation(String value){
              System.out.println(value);
    }
}
