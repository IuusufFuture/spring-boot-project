package com.example.finalporject.controllers;

import com.example.finalporject.models.dto.UserDto;
import com.example.finalporject.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveUser")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }

    @PostMapping("/sendCodeToEmail")
    public ResponseEntity<?> sendCodeToEmail(@RequestParam String login) {
        return userService.sendCode(login);
    }

    @GetMapping("/getToken")
    public ResponseEntity<?> getTokenLogin(@RequestParam String login, @RequestParam String code) {
        return userService.getToken(login, code);
    }

    @GetMapping("/verify")
    public ResponseEntity<?> verifyLogin(@RequestParam String token) {
        return userService.verifyUser(token);
    }
}
