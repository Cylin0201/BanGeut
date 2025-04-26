package com.example.MyProject01.service;

import com.example.MyProject01.dto.UserLifeStyleDto;
import com.example.MyProject01.model.UserEntity;
import com.example.MyProject01.model.UserLifestyle;
import com.example.MyProject01.repository.UserLifestyleRepository;
import com.example.MyProject01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLifeStyleService {
    @Autowired
    private UserLifestyleRepository userLifeStyleRepository;

    @Autowired
    private UserRepository userRepository;

    public UserLifestyle saveUserLifestyle(Long userId, UserLifeStyleDto userLifestyleDto) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        UserLifestyle userLifestyle = new UserLifestyle(
                userLifestyleDto.getBirthYear(),
                userLifestyleDto.getStudentId(),
                userLifestyleDto.getCollege(),
                userLifestyleDto.getSleepTime(),
                userLifestyleDto.getWakeUpTime(),
                userLifestyleDto.getSleepingHabits(),
                userLifestyleDto.getIsSmoking(),
                userLifestyleDto.getUsesHanger(),
                userLifestyleDto.getUsesFridge(),
                userLifestyleDto.getStayDuration(),
                user
        );
        return userLifeStyleRepository.save(userLifestyle);

    }

    public UserLifestyle getUserLifestyle(Long userId) {
        return (UserLifestyle) userLifeStyleRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("User lifestyle not found"));
    }
}
