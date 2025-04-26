package com.example.MyProject01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLifeStyleDto {
    private Integer birthYear;
    private String studentId;
    private String college;
    private String sleepTime;
    private String wakeUpTime;
    private Boolean sleepingHabits;
    private Boolean isSmoking;
    private Boolean usesHanger;
    private Boolean usesFridge;
    private String stayDuration;
}
