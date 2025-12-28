package com.example.user_auth.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
