package com.amit.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("sayHello")
    public String sayHello()
    {
        return "Hello World From Notification Service";
    }
}
