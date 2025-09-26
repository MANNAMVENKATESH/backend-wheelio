package com.example.CarRental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Car Rental Backend is running!<br>" +
               "Available endpoints:<br>" +
               "- GET /api/ - API info<br>" +
               "- POST /api/login - User login<br>" +
               "- POST /api/register - User registration<br>" +
               "- GET /api/payments - Get payments<br>" +
               "- POST /api/payment - Create payment";
    }
}
