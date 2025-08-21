package org.example;
// This is service layer used for api work 
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceReddit {
    private final WebClient webClient;
    
    // constructor
    public ServiceReddit(WebClient webClient){
        this.webClient =webClient;

    }
    public Mono<String> getSubRedditReactive(String name){
        return webClient.get().uri("/${name}.json",name).retrieve().bodyToMono(String.class);
    }
}
