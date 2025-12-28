package com.example.user_auth.controller;

import com.example.user_auth.dto.LoginRequest;
import com.example.user_auth.dto.RegisterRequest;
import com.example.user_auth.service.AuthService;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth/register")
    public String register(@RequestBody RegisterRequest request) {
        authService.register(request.getEmail(), request.getPassword());
        return "Register sukses";
    }

    @PostMapping("/auth/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request.getEmail(), request.getPassword());
    }

    @GetMapping("/protected")
    public String protectedEndpoint(){
        return "Login Berhasil mengakses Endpoint Protected";
    }
}
