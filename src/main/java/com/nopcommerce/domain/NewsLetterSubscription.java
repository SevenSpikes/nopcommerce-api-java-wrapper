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
public class NewsLetterSubscription
{
    @JsonProperty(value = JsonConstants.ID)
    private Integer id;

    @JsonProperty(value = JsonConstants.EMAIL)
    private String email;

    @JsonProperty(value = JsonConstants.STORE_ID)
    private Integer storeId;

    @JsonProperty(value = JsonConstants.ACTIVE)
    private boolean active;

    @JsonProperty(value = JsonConstants.CREATED_ON_UTC)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date createdDate;
}
