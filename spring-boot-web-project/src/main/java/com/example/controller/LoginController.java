package com.example.controller;

import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/{username}/{password}")
    public ResponseEntity<String> loginUser(
            @PathVariable String username,
            @PathVariable String password) {
        boolean isValidUser = loginService.validateUser(username, password);
        if (isValidUser) {
            return ResponseEntity.ok("success");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}