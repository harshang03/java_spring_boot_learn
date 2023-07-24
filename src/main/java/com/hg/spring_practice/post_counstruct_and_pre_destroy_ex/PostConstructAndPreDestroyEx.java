package com.hg.spring_practice.post_counstruct_and_pre_destroy_ex;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PostConstructAndPreDestroyEx {
    private String msg;

    @PostConstruct
    public void init() {
        msg = "this is for @PostConstruct!";
    }

    @PreDestroy
    public void exitt() {
        System.out.println("This is @PreDestroy!");
    }

    public void showMessage() {
        System.out.println("msg: " + msg);
    }
}
