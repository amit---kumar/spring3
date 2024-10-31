package com.amit.searchservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("sayHello")
    public String sayHello()
    {
        return "Hello World From Search Service";
    }
}
