package com.paulo.controller;

import com.paulo.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private UserConfig userConfig;
    
    @GetMapping("/getConfig")
    public UserConfig config(){
        return userConfig;
    }
}
