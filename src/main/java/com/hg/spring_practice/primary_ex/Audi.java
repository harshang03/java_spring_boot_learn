package com.hg.spring_practice.primary_ex;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Car {
    @Override
    public String carName() {
        return "This is Audi";
    }
}
