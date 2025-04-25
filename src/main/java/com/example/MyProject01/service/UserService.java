package com.example.MyProject01.service;

import com.example.MyProject01.dto.SignUpRequest;
import com.example.MyProject01.model.UserEntity;
import com.example.MyProject01.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void signUp(SignUpRequest dto){
        if (userRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
        }
        UserEntity user = UserEntity.builder()
                .email(dto.getEmail())
                .userId(dto.getUserId())
                .password(dto.getPassword())
                .name(dto.getName())
                .gender(dto.isGender())
                .build();
        userRepository.save(user);
    }
}
