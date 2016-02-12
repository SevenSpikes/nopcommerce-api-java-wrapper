package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductType
{
    SimpleProduct(5),

    GroupedProduct(10);

    private int value;

    ProductType(final int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return this.value;
    }

    @JsonCreator
    public static ProductType fromValue(int typeCode) {
        for (ProductType productType: ProductType.values()) {
            if (productType.value==typeCode) {
                return productType;
            }
        }
        throw new IllegalArgumentException("Invalid Product Type type code: " + typeCode);

    }
}
