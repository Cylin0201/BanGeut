package com.example.MyProject01.controller;

import com.example.MyProject01.dto.UserLifeStyleDto;
import com.example.MyProject01.model.UserLifestyle;
import com.example.MyProject01.service.UserLifeStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user/lifestyle")
public class UserLifeStyleController {
    @Autowired
    private UserLifeStyleService userLifeStyleService;

    @PostMapping("/save/{userID}")
    public UserLifestyle saveUserLifestyle(@PathVariable Long userId, @RequestBody UserLifeStyleDto userLifeStyleDto){
        return userLifeStyleService.saveUserLifestyle(userId, userLifeStyleDto);
    }

    @GetMapping("/get/{userId}")
    public UserLifestyle getUserLifestyle(@PathVariable Long userID){
        return userLifeStyleService.getUserLifestyle(userID);
    }

    @PutMapping("/update/{userId}")
    public UserLifestyle updateUserLifestyle(@PathVariable Long userID, @RequestBody UserLifeStyleDto userLifeStyleDto){
        return userLifeStyleService.saveUserLifestyle(userID, userLifeStyleDto);

    }
}
