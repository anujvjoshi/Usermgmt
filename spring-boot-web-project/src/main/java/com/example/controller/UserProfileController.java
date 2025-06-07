package com.example.controller;

import com.example.service.HomepageService;
import com.example.service.UserProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user-profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public ResponseEntity<String> addUserProfile(@RequestBody Map<String, String> user) {
        String name = user.get("name");
        String address = user.get("address");
        String password = user.get("password");
        userProfileService.addUserProfile(name, address, password);
        return ResponseEntity.ok("User profile saved successfully!");
    }

    @GetMapping("/all")
    public List<Map<String, Object>> getAllUsers() {
        // Fetch all user profiles from the database  
        // and return them as a list of maps
        // Each map contains the username and address of a user
        // This will be used to display user profiles on the user-profile.html page
        // The frontend will use this data to render the user profiles
        // Example response:
        System.out.println("Fetching all user profiles from the database." +userProfileService.getAllUsers());
        return userProfileService.getAllUsers();
    }
}