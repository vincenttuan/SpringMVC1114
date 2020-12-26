package com.spring.mvc.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    /*
        Ant 語法
        * : 任意多字
        ? : 任意一字
        ** : 任意多組資料夾
    */
    @RequestMapping("/*/ant")
    @ResponseBody
    public String antPath1() {
        return "ant path 1";
    }
    
    @RequestMapping("/ant?")
    @ResponseBody
    public String antPath2() {
        return "ant path 2";
    }
    
    @RequestMapping("/**/ant")
    @ResponseBody
    public String antPath3() {
        return "ant path 3";
    }
    
    @RequestMapping("/add/{x}/{y}")
    @ResponseBody
    public String add(@PathVariable("x") int x, @PathVariable int y) {
        return String.format("%d + %d = %d", x, y, (x+y));
    }
    
    
    
}
