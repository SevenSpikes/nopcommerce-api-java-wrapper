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
public class Customer
{
    @JsonProperty(value = JsonConstants.ID)
    private String id;

    @JsonProperty(value = JsonConstants.EMAIL)
    private String email;

    @JsonProperty(value = JsonConstants.FIRST_NAME)
    private String firstName;

    @JsonProperty(value = JsonConstants.LAST_NAME)
    private String lastName;

    @JsonProperty(value = JsonConstants.REGISTERED_DATE)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date registeredDate;
}
