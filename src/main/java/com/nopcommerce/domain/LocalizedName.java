package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

@Data
public class LocalizedName
{
    @JsonProperty(value = JsonConstants.LANGUAGE_ID)
    private Integer languageId;

    @JsonProperty(value = JsonConstants.LOCALIZED_NAME)
    private String localizedName;
}
