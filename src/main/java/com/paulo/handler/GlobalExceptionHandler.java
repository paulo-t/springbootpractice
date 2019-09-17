package com.paulo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "com.paulo.controller")
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,String> onException(){
        Map<String,String> result = new HashMap<>();
        result.put("errorCode","500");
        result.put("errorMessage","请求错误");
        return result;
    }
}
