package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @GetMapping("/abc")
    public String Hello(){
        return "Hi form the path / in spring boot";
    }
}
