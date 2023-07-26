package com.sanstech.unitask.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleHelloWorldApi {
    
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
