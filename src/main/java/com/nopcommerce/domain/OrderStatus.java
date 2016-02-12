package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus
{
    Pending("Pending"),

    Processing("Processing"),

    Complete("Complete"),

    Cancelled("Cancelled");

    private String value;

    OrderStatus(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}