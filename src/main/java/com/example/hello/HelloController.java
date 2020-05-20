package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Hello
    @Autowired
    HelloService helloService;

    @GetMapping
    public String hello() {
        return helloService.hello();
    }
}
