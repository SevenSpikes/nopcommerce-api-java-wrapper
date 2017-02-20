package com.nopcommerce.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ContentTypeRequestInterceptor implements RequestInterceptor
{
    @Override
    public void apply(RequestTemplate template)
    {
        template.header("Content-Type", "application/json");
        template.header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20100101 Firefox/10.0");
    }
}
