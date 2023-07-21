package com.hg.spring_practice.primary_ex;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BMW implements Car{
    @Override
    public String carName() {
        return "This is BMW which is primary component!";
    }
}
