package com.spring.mvc.controller;

import java.util.Date;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @RequestMapping(value = {"/tw", "/taiwan"})
    @ResponseBody
    public String welcome() {
        return "Taiwan welcome U";
    }
    
    @RequestMapping("/add/{x}/{y}")
    @ResponseBody
    public String add(@PathVariable("x") int x, @PathVariable int y) {
        return String.format("%d + %d = %d", x, y, (x+y));
    }
    
    @RequestMapping("/area/{r}")
    @ResponseBody
    public String area(@PathVariable(name = "r", required = false) Integer r) {
        if(r == null) {
            return "r = ?";
        } else {
            return Math.pow(r, 2) * Math.PI + "";
        }
    }
    
    @RequestMapping("/area2/{r}")
    @ResponseBody
    public String area2(@PathVariable Optional<Integer> r) {
        if(r.isPresent()) {
            return Math.pow(r.get(), 2) * Math.PI + "";
        } else {
            return "r = ?";
        }
    }
    
    @RequestMapping("/bmi")
    @ResponseBody
    public String bmi(@RequestParam Optional<Double> h,
                      @RequestParam Optional<Double> w) {
        
        if(!h.isPresent()) {
            return "h = ?";
        }
        if(!w.isPresent()) {
            return "w = ?";
        }
        
        double bmi = w.get() / Math.pow(h.get()/100, 2);
        return String.format("%.2f", bmi);
        
        
    }
    
    
}
