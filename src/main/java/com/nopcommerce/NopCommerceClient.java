package com.nopcommerce;

import com.nopcommerce.domain.CustomerList;
import feign.RequestLine;

public interface NopCommerceClient
{
    @RequestLine("GET /api/customers")
    CustomerList getCustomers();
}
