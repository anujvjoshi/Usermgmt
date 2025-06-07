package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserProfileService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUserProfile(String name, String address, String password) {
        String sql = "INSERT INTO users (username, password, address) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, name, password, address);
    }

    public List<Map<String, Object>> getAllUsers() {
        String sql = "SELECT username, address FROM users";
        return jdbcTemplate.queryForList(sql);
    }
}