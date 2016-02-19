package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductType
{
    SimpleProduct("SimpleProduct"),

    GroupedProduct("GroupedProduct");

    private String value;

    ProductType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}
