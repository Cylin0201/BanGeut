package com.example.MyProject01.controller;

import com.example.MyProject01.dto.SignUpDto;
import com.example.MyProject01.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/sign-up")
    ResponseEntity<String> signUp(@RequestBody SignUpDto req){
        userService.signUp(req);
        return ResponseEntity.ok("회원가입 성공!");
    }
}
