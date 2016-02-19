package com.nopcommerce;

import com.nopcommerce.auth.OAuthRequestInterceptor;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class NopCommerceFactory
{
    public static NopCommerceClient create(String accessToken, String storeUrl)
    {
        NopCommerceClient nopCommerceClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .requestInterceptor(new OAuthRequestInterceptor(accessToken))
                .target(NopCommerceClient.class, storeUrl);

        return nopCommerceClient;
    }
}
