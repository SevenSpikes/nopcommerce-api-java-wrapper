package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.List;

@Data
public class ProductCategoryMappingList
{
    @JsonProperty(value = JsonConstants.PRODUCT_CATEGORY_MAPPINGS)
    private List<ProductCategoryMapping> productCategoryMappings;
}
