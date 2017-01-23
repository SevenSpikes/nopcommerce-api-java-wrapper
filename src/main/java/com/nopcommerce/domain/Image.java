package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

@Data
public class Image
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.IMAGES)
    private String src;
}
