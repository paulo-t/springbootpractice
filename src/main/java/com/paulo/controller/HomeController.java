package com.paulo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;



@Controller
@Slf4j
public class HomeController {
    //private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/index")
    public String index(Map<String,String> param){
        param.put("name","paulo");
        param.put("desc","come on ！");
        try{
            int i = 1/0;
        }catch (Exception e){
            log.error("error:{}",e.getMessage());
        }

        return "index";
    }
}
