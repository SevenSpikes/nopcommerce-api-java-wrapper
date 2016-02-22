package com.nopcommerce;

import com.nopcommerce.domain.*;
import feign.Param;
import feign.RequestLine;

public interface NopCommerceClient
{
    int MAXIMUM_API_CALL_LIMIT = 250;

    @RequestLine("GET /api/customers?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    CustomerList getCustomers(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);

    @RequestLine("GET /api/categories?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    CategoryList getCategories(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);

    @RequestLine("GET /api/products?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    ProductList getProducts(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);

    @RequestLine("GET /api/product_category_mappings?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    ProductCategoryMappingList getProductCategoryMappings(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);

    @RequestLine("GET /api/orders?limit={limit}&since_id={since-id}&page={page}&fields={fields}")
    OrderList getOrders(@Param("limit") Integer limit, @Param("page") Integer page, @Param("since-id") String sinceId, @Param("fields") String fields);
}
