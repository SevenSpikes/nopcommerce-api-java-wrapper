package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nopcommerce.jackson.FlexDateDeserializer;
import com.nopcommerce.jackson.FlexDateSerializer;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Order
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.ORDER_TOTAL)
    private BigDecimal orderTotal;

    @JsonProperty(value = JsonConstants.ORDER_DISCOUNT)
    private BigDecimal orderDiscount;

    @JsonProperty(value = JsonConstants.BILLING_ADDRESS)
    private Address billingAddress;

    @JsonProperty(value = JsonConstants.SHIPPING_ADDRESS)
    private Address shippingAddress;

    @JsonProperty(value = JsonConstants.CUSTOMER)
    private Customer customer;

    @JsonProperty(value = JsonConstants.SHIPPING_METHOD)
    private String shippingMethod;

    @JsonProperty(value = JsonConstants.ORDER_STATUS)
    private OrderStatus orderStatus;

    @JsonProperty(value = JsonConstants.PAYMENT_STATUS)
    private PaymentStatus paymentStatus;

    @JsonProperty(value = JsonConstants.SHIPPING_STATUS)
    private ShippingStatus shippingStatus;

    @JsonProperty(value = JsonConstants.ORDER_ITEMS)
    private List<OrderItem> orderItems;

    @JsonProperty(value = JsonConstants.CREATED_ON_UTC)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date createdDate;
}
