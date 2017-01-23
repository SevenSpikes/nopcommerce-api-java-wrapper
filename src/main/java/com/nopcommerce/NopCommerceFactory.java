package com.nopcommerce;

import com.nopcommerce.auth.ContentTypeRequestInterceptor;
import com.nopcommerce.auth.OAuthRequestInterceptor;
import feign.Feign;
import feign.RequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.ArrayList;

public class NopCommerceFactory
{
    public static NopCommerceClient create(String accessToken, String storeUrl)
    {
        // Prepare the request interceptors
        ArrayList<RequestInterceptor> requestInterceptors = new ArrayList<>();

        requestInterceptors.add(new OAuthRequestInterceptor(accessToken));
        requestInterceptors.add(new ContentTypeRequestInterceptor());

        NopCommerceClient nopCommerceClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
//                .logger(new Logger.JavaLogger().appendToFile("http.log"))
//                .logLevel(Logger.Level.FULL)
                .requestInterceptors(requestInterceptors)
                .target(NopCommerceClient.class, storeUrl);

        return nopCommerceClient;
    }
}
