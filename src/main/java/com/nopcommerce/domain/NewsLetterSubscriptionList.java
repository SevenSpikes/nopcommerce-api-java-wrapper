package com.nopcommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nopcommerce.json.JsonConstants;
import lombok.Data;

import java.util.List;

@Data
public class NewsLetterSubscriptionList
{
    @JsonProperty(value = JsonConstants.NEWS_LETTER_SUBSCRIPTIONS)
    private List<NewsLetterSubscription> newsLetterSubscriptions;
}
