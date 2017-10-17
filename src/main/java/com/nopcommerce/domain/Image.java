package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

@Data
public class Image
{
    @JsonProperty(value = JsonConstants.ID)
    private Integer id;

    @JsonProperty(value = JsonConstants.SRC)
    private String src;
}
