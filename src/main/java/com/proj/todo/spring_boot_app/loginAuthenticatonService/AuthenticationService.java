package com.proj.todo.spring_boot_app.loginAuthenticatonService;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("Kunal");
        boolean isValidPassword = password.equalsIgnoreCase("admin123");

        return isValidPassword && isValidUsername;
    }
}
