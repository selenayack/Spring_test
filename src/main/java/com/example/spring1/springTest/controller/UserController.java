package com.example.spring1.springTest.controller;

import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.Service.ts.UserService;
import com.example.spring1.springTest.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String  id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }


    @PostMapping("/save")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(userService.save(userDTO));

    }













}
