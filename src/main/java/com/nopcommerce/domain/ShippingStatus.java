package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ShippingStatus
{
    ShippingNotRequired("ShippingNotRequired"),

    NotYetShipped("NotYetShipped"),

    PartiallyShipped("PartiallyShipped"),

    Shipped("Shipped"),

    Delivered("Delivered");


    private String value;

    ShippingStatus(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}