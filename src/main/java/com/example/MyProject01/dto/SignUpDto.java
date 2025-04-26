package com.example.MyProject01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SignUpDto {
    private String email;
    private String userId;
    private String password;
    private String name;
    private boolean gender;
}
