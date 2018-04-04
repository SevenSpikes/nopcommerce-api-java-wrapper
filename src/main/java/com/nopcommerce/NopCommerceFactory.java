package com.nopcommerce;

import com.nopcommerce.auth.ContentTypeRequestInterceptor;
import com.nopcommerce.auth.OAuthRequestInterceptor;
import feign.Feign;
import feign.RequestInterceptor;
import feign.Retryer;
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

//        Request.Options feignOptions = new Request.Options(10000, 30000);

        Retryer retryer = new Retryer.Default(0,0,0);

        NopCommerceClient nopCommerceClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
//                .logger(new Logger.JavaLogger().appendToFile("http.log"))
//                .logLevel(Logger.Level.FULL)
                .requestInterceptors(requestInterceptors)
//                .options(feignOptions)
                .retryer(retryer)
                .target(NopCommerceClient.class, storeUrl);

        return nopCommerceClient;
    }
}
