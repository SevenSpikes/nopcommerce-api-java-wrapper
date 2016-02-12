package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentStatus
{
    Pending("Pending"),

    Authorized("Authorized"),

    Paid("Paid"),

    PartiallyRefunded("PartiallyRefunded"),

    Refunded("Refunded"),

    Voided("Voided");


    private String value;

    PaymentStatus(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}