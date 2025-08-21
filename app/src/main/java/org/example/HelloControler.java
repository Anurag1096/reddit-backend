package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloControler {
    // need to add an api which when accessed with query parm return data by calling the reddit subreddit api.@GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/abc")
    public String Hello(){
        return "Hi form the path / in spring boot";
    }

    @GetMapping("/first")
    public String Goto(){
        return "new first path";
    }
    
}
