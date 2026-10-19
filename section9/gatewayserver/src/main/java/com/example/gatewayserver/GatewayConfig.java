package com.example.gatewayserver;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 3) Routes configurees avec RouteLocator (Java).
 * Active seulement avec le profil "routelocator"
 * (ex: -Dspring.profiles.active=routelocator) pour ne pas dupliquer
 * les routes deja declarees dans application.yml.
 */
@Configuration
@Profile("routelocator")
public class GatewayConfig {

    @Bean
    public RouteLocator myRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("marque-route", p -> p
                        .path("/api/marques/**")
                        .uri("lb://MARQUE-MICROSERVICE"))
                .route("parfum-route", p -> p
                        .path("/api/parfums/**")
                        .uri("lb://PARFUM"))
                .build();
    }
}
