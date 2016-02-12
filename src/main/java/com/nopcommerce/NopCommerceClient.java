package com.nopcommerce;

import com.nopcommerce.domain.CustomerList;
import feign.Param;
import feign.RequestLine;

public interface NopCommerceClient
{
    int MAXIMUM_API_CALL_LIMIT = 250;

    @RequestLine("GET /api/customers?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    CustomerList getCustomers(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);
}
