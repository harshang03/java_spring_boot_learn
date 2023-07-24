package com.hg.spring_practice.lazy_ex;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyEx {
    public LazyEx() {
        System.out.println("Lazy annotated class' constructor called");
    }

    public void display() {
        System.out.println("Lazy annotated class' display method called");
    }
}
