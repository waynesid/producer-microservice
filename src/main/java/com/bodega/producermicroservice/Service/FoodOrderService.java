package com.bodega.producermicroservice.Service;

import com.bodega.producermicroservice.Order.FoodOrder;
import com.bodega.producermicroservice.Producer.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wayne Sidney
 * Created on {06/06/2022}
 */
@Slf4j
@Service
public class FoodOrderService {


    @Autowired
    private Producer producer;

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }


}
