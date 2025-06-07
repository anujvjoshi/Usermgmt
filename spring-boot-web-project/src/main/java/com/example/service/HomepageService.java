package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getHomepage() {
        // Return only a success string
        return "success";
    }

    public void addUserProfile(String name, String address, String password) {
        String sql = "INSERT INTO users (username, password, address) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, name, password, address);
    }
}