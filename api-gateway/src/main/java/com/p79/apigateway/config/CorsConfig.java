package com.p79.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Replace "*" with the allowed origins
        config.addAllowedMethod("*"); // Replace "*" with the allowed HTTP methods
        config.addAllowedHeader("*"); // Replace "*" with the allowed headers
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
