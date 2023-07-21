package com.hg.spring_practice.post_counstruct_ex;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PostConstructEx {
    private String msg;

    @PostConstruct
    public void init() {
        msg = "this is for @PostConstruct!";
    }

    public void showMessage() {
        System.out.println("msg: " + msg);
    }
}
