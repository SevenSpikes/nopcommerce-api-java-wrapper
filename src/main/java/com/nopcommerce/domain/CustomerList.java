package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.List;

@Data
public class CustomerList
{
    @JsonProperty(value = JsonConstants.CUSTOMERS)
    private List<Customer> customers;
}
