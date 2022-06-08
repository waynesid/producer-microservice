package com.bodega.producermicroservice.Controller;

import com.bodega.producermicroservice.Order.FoodOrder;
import com.bodega.producermicroservice.Service.FoodOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wayne Sidney
 * Created on {06/06/2022}
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class FoodOrderController {

    @Autowired
    private FoodOrderService foodOrderService;

    @PostMapping()
    private String createFoodOrder(@RequestBody FoodOrder foodOrder) throws JsonProcessingException {
        log.info("create food order received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
