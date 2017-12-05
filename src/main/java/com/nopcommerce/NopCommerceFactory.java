package com.nopcommerce;

import com.nopcommerce.auth.ContentTypeRequestInterceptor;
import com.nopcommerce.auth.OAuthRequestInterceptor;
import feign.Feign;
import feign.Request;
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

        // Set the connection and read timeouts to 2 minutes. In some nopCommerce websites
        // with a lot of data a request may take 1+ minute.
        Request.Options feignOptions = new Request.Options(120000, 120000);

        NopCommerceClient nopCommerceClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
//                .logger(new Logger.JavaLogger().appendToFile("http.log"))
//                .logLevel(Logger.Level.FULL)
                .requestInterceptors(requestInterceptors)
                .options(feignOptions)
                .target(NopCommerceClient.class, storeUrl);

        return nopCommerceClient;
    }
}
