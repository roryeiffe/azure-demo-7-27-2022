package com.revature.azuredemo7272022.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("")
    public String hello() {
        return "Hello Rory!\n New Addition";
    }
}
