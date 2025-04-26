package com.example.MyProject01.repository;

import com.example.MyProject01.model.UserLifestyle;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLifestyleRepository extends JpaRepository<UserLifestyle, Long> {
    Optional<User> findByUserId(Long userId);
}
