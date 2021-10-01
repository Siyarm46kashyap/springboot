package com.example.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocolntroller {
    @RequestMapping("/")
    public String hrllo()
    {
        return "Hello World!";
    }
}
