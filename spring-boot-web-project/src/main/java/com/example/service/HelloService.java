package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
  
  public String getGreeting() {
    return "Hello, you have logged in successfully ";
  } 
}
