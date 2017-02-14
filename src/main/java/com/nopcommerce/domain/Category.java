package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nopcommerce.jackson.FlexDateDeserializer;
import com.nopcommerce.jackson.FlexDateSerializer;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.Date;

@Data
public class Category
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.NAME)
    private String name;

    @JsonProperty(value = JsonConstants.SE_NAME)
    private String seName;

    @JsonProperty(value = JsonConstants.CREATED_ON_UTC)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date createdDate;
}
