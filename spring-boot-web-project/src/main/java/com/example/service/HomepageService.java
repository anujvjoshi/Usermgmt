package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getHomepage() {
        // Simple homepage HTML with a menu for user profiles
        
        return "<div style='text-align:center;'>" +
                "<h2>Welcome! You have logged in successfully.</h2>" +
                "<a href='/user-profile.html'><button>User Profiles</button></a>" +
                "</div>";
    }

    public void addUserProfile(String name, String address, String password) {
        String sql = "INSERT INTO users (username, password, address) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, name, password, address);
    }
}