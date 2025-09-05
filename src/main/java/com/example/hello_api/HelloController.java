package com.example.hello_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloController {

    @PostMapping("/hello")
    public HelloResponse hello(@RequestBody HelloRequest request) {
        return new HelloResponse("Ciao, " + request.getName());
    }
    
    static class HelloRequest {
        private String name;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
    }
    
    static class HelloResponse {
        private String message;
        
        public HelloResponse(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
}