package com.example.architecture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/admin")
    String getAdmin() {
        return "admin";
    }

    @GetMapping("/any")
    String getAny() {
        return "any";
    }

}
