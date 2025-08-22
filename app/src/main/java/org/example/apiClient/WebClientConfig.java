package org.example.apiClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;



@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(WebClient.Builder builder ){
        return builder
        .baseUrl("https://www.reddit.com/r")
        .defaultHeader("User-Agent", "spring-boot-app/1.0 (by /u/ElephantAnurag)")
        .build();
    }
}
