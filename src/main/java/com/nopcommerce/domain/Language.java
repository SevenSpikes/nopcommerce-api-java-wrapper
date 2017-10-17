package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Language
{
    @JsonProperty(value = JsonConstants.ID)
    private int id;

    @JsonProperty(value = JsonConstants.NAME)
    private String name;

    @JsonProperty(value = JsonConstants.LANGUAGE_CULTURE)
    private String languageCulture;

    @JsonProperty(value = JsonConstants.LIMITED_TO_STORES)
    private boolean limitedToStores;

    @JsonProperty(value = JsonConstants.STORE_IDS)
    private ArrayList<Integer> storeIds;
}
