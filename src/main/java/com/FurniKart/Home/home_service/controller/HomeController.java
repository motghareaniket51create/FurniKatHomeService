package com.FurniKart.Home.home_service.controller;

import com.FurniKart.Home.home_service.model.Home;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<Home> home(){
        return ResponseEntity.ok(new Home("Welcome to FurniKart Home Service!"));
    }
}