package com.nopcommerce.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ContentTypeRequestInterceptor implements RequestInterceptor
{
    @Override
    public void apply(RequestTemplate template)
    {
        template.header("Content-Type", "application/json");
    }
}
