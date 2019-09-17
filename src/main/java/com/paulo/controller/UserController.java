package com.paulo.controller;

import com.paulo.dataobject.User;
import com.paulo.service.EmailService;
import com.paulo.service.UserService;
import com.paulo.service.impl.TextServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;
    @Autowired
    private TextServiceImpl textServiceImpl;
    @GetMapping("/user")
    public User getUser(int id){
        User user = userService.findById(id);
        emailService.sendEmail();
        Future<Boolean> textFuture = textServiceImpl.sendText(user);
        try {
            boolean messageResult =  textFuture.get();
            if(messageResult){
                log.info("发送短信成功");
            }else{
                log.info("发送短信失败");
            }
        } catch (InterruptedException e) {
            log.info("资源释放完毕");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            log.info("error:{}",e.getMessage());
        }
        return user;
    }
}
