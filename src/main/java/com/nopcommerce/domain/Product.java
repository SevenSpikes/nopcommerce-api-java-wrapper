package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nopcommerce.jackson.FlexDateDeserializer;
import com.nopcommerce.jackson.FlexDateSerializer;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Product
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.NAME)
    private String name;

    @JsonProperty(value = JsonConstants.SHORT_DESCRIPTION)
    private String shortDescription;

    @JsonProperty(value = JsonConstants.FULL_DESCRIPTION)
    private String fullDescription;

    @JsonProperty(value = JsonConstants.SKU)
    private String sku;

    @JsonProperty(value = JsonConstants.SE_NAME)
    private String seName;

    @JsonProperty(value = JsonConstants.IMAGES)
    private List<Image> images;

    @JsonProperty(value = JsonConstants.STOCK_QUANTITY)
    private int stockQuantity;

    @JsonProperty(value = JsonConstants.PRICE)
    private BigDecimal price;

    @JsonProperty(value = JsonConstants.OLD_PRICE)
    private BigDecimal oldPrice;

    @JsonProperty(value = JsonConstants.PRODUCT_COST)
    private BigDecimal productCost;

    @JsonProperty(value = JsonConstants.CUSTOMER_ENTERS_PRICE)
    private Boolean customerEntersPrice;

    @JsonProperty(value = JsonConstants.PRODUCT_TYPE)
    private ProductType productType;

    @JsonProperty(value = JsonConstants.CREATED_ON_UTC)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date createdDate;
}
