package com.bodega.producermicroservice.Producer;

import com.bodega.producermicroservice.Order.FoodOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Wayne Sidney
 * Created on {06/06/2022}
 */
@Slf4j
@Component
public class Producer {
    @Value("${topic.name}")
    private String orderTopic;

    @Autowired
    private  ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(FoodOrder foodOrder) throws JsonProcessingException {
        String orderMessage = objectMapper.writeValueAsString(foodOrder);
        kafkaTemplate.send(orderTopic, orderMessage);

        log.info("food order produced {}", orderMessage);

        return "message sent";
    }
}
