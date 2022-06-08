package com.bodega.producermicroservice.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * @author Wayne Sidney
 * Created on {06/06/2022}
 */
@Data
@Value
public class FoodOrder {
    private String item;
    private Double amount;
}
