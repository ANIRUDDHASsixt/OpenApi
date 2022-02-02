package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    public String getGreeting(){
        String Hello="Hello World";
        return Hello;
    }
}