package com.example.MyProject01.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean gender; //여자는 true, 남자는 false

    @Column(nullable = false)
    private Boolean matched = false;
    
    //룸메 매칭 여부(기본값: false)
    @OneToOne
    @JoinColumn(name = "roommate_id")
    private UserEntity roommate;

    @Builder
    public UserEntity(String email, String userId, String password, String name, boolean gender, String college, String department){
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.gender = gender;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserLifestyle userLifestyle;
}
