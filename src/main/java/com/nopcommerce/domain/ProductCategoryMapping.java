package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

@Data
public class ProductCategoryMapping
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.PRODUCT_ID)
    private int productId;

    @JsonProperty(value = JsonConstants.CATEGORY_ID)
    private int categoryId;
}
