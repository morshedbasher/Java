package com.morshed.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .route(P -> P
                        .path("/api/users/2")
                        .filters(f -> f.hystrix(config -> config.setName("api-test")))
                        .uri("https://reqres.in/"))
                .route(P -> P
                        .path("/get_allusers")
                        .filters(f -> f.hystrix(config -> config.setName("spam-api")))
                        .uri("http://localhost:8084/"))
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f -> f.hystrix(config -> config.setName("mycmd")))
                        .uri("http://httpbin.org:80"))
                .build();
    }
}
