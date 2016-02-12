package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

@Data
public class OrderItem
{
    @JsonProperty(value = JsonConstants.QUANTITY)
    private int quantity;

    @JsonProperty(value = JsonConstants.PRODUCT)
    private Product product;
}
