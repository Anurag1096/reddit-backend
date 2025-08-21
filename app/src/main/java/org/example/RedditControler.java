package org.example;
// This is the rest controler layer  for reddit endpoint.
// It will handle the request and resoponse part of the data lifecycle.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.example.ServiceReddit;
import reactor.core.publisher.Mono;



public class RedditControler {
    
    private final ServiceReddit serviceReddit;

    // constructor
    public RedditControler(ServiceReddit serviceReddit){
        this.serviceReddit = serviceReddit;
    }

    @GetMapping("/subReddit/{name}")
    public Mono<String> getSubRedditReactive(@PathVariable String name){
        return serviceReddit.getSubRedditReactive(name);
    }
}
