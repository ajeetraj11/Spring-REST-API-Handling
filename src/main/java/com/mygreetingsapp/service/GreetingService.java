package com.mygreetingsapp.service;

import org.springframework.stereotype.Service;

// Service layer to handle business logic
@Service
public class GreetingService {
    // Get method to get the content
    public String getGreetingMessage() {
        return "Hello Ajeet Raj, this is a GET request!";
    }

    // Post Method to send the response body
    public String postGreetingMessage() {
        return "Hello Ajeet Raj, this is a POST request!";
    }

    // Put Method to  update the data
    public String putGreetingMessage() {
        return "Hello Ajeet Raj, this is a PUT request!";
    }

    // Delete method to delete the data
    public String deleteGreetingMessage() {
        return "Hello Ajeet Raj, this is a DELETE request!";
    }
}