package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.HashMap;
import java.util.Set;

@Data
public class WebHook
{
    @JsonProperty(value = JsonConstants.ID)
    private String id;

    @JsonProperty(value = JsonConstants.DESCRIPTION)
    private String description;

    @JsonProperty(value = JsonConstants.FILTERS)
    private Set<String> filters;

    @JsonProperty(value = JsonConstants.IS_PAUSED)
    private boolean isPaused;

    @JsonProperty(value = JsonConstants.HEADERS)
    private HashMap<String, String> headers;

    @JsonProperty(value = JsonConstants.PROPERTIES)
    private HashMap<String, Object> properties;

    @JsonProperty(value = JsonConstants.SECRET)
    private String secret;

    @JsonProperty(value = JsonConstants.WEB_HOOK_UIR)
    private String webHookUri;
}
