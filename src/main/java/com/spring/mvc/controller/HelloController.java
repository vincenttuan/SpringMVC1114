package com.spring.mvc.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @RequestMapping("/now")
    @ResponseBody
    public String today() {
        return new Date().toString();
    }
    
    @RequestMapping("/greet")
    @ResponseBody
    public String greet() {
        return "Hello SpringMVC";
    }
    
    
}
