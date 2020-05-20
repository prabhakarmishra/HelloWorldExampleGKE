package com.example.hello;

import org.springframework.stereotype.Service;

//@Hello
@Service
public class HelloService {

    public HelloService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }

    public String hello() {
        return "My First Spring boot service in google kubernates";
    }
}
