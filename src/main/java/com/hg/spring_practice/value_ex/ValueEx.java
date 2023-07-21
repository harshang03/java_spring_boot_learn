package com.hg.spring_practice.value_ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueEx {

    @Value("${app.message}")
    private String msg;

    public String show() {
        return "@value: "+msg;
    }
}
