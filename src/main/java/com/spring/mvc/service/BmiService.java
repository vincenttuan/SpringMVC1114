package com.spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class BmiService {
    
    public Double calcBmi(Double h, Double w) {
        return w / Math.pow(h/100, 2);
    }
    
}
