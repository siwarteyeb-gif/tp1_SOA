
package com.example.gatewayserver;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator myRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("marque-route", p -> p
                        .path("/api/marques/**")
                        .uri("lb://MARQUE-MICROSERVICE"))
                .route("parfum-route", p -> p
                        .path("/api/parfums/**")
                        .filters(f -> f.circuitBreaker(config -> config
                                .setName("parfumCircuitBreaker")
                                .setFallbackUri("forward:/contactAdmin")))
                        .uri("lb://PARFUM"))
                .build();
    }
}
