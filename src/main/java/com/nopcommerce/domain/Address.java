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
public class Address
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.EMAIL)
    private String email;

    @JsonProperty(value = JsonConstants.FIRST_NAME)
    private String firstName;

    @JsonProperty(value = JsonConstants.LAST_NAME)
    private String lastName;

    @JsonProperty(value = JsonConstants.COMPANY)
    private String company;

    @JsonProperty(value = JsonConstants.COUNTRY)
    private String country;

    @JsonProperty(value = JsonConstants.CITY)
    private String city;

    @JsonProperty(value = JsonConstants.PROVINCE)
    private String province;

    @JsonProperty(value = JsonConstants.ZIP_CODE)
    private String zip;

    @JsonProperty(value = JsonConstants.PHONE)
    private String phone;

    @JsonProperty(value = JsonConstants.ADDRESS1)
    private String address1;

    @JsonProperty(value = JsonConstants.ADDRESS2)
    private String address2;

    @JsonProperty(value = JsonConstants.CREATED_ON_UTC)
    @JsonDeserialize(using = FlexDateDeserializer.class)
    @JsonSerialize(using = FlexDateSerializer.class)
    private Date createdDate;
}
