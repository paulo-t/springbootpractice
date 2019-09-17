package com.paulo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@MapperScan(basePackages = "com.paulo.mapper")
@EnableAsync(proxyTargetClass = true)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
