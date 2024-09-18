package com.deliveryboy.Delevery_boy.Service;

import com.deliveryboy.Delevery_boy.Config.AppConstants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private Logger logger= LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){

        this.kafkaTemplate.send(AppConstants.location_topic_name,location);
        this.logger.info("message produced");
        return true;

    }
}
