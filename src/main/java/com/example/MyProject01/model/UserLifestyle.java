package com.example.MyProject01.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLifestyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 생년
    private Integer birthYear;

    // 학번(예시: 24학번)
    private String studentId;

    // 단과대
    private String college;

    // 취침 시간 & 기상 시간
    private String sleepTime;
    private String wakeUpTime;

    // 잠버릇
    private Boolean sleepingHabits;

    // 흡연 여부
    private Boolean isSmoker;

    // 행거/냉장고 여부
    private Boolean usesHanger;
    private Boolean usesFridge;

    // 희망 거주 타입(반기, 학기, 연간)
    private String stayDuration;

    // === 연관 관계 설정 ===
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private UserEntity user;

    public UserLifestyle(Integer birthYear, String studentId, String college, String sleepTime,
                         String wakeUpTime, Boolean sleepingHabits, Boolean isSmoker, Boolean hangerUse,
                         Boolean usesFridge, String stayDuration, UserEntity user) {
        this.birthYear = birthYear;
        this.studentId = studentId;
        this.college = college;
        this.sleepTime = sleepTime;
        this.wakeUpTime = wakeUpTime;
        this.sleepingHabits = sleepingHabits;
        this.isSmoker = isSmoker;
        this.usesHanger = hangerUse;
        this.usesFridge = usesFridge;
        this.stayDuration = stayDuration;
        this.user = user;
    }
}