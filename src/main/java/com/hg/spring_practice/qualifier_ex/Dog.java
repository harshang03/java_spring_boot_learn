package com.hg.spring_practice.qualifier_ex;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bhau bhau!!");
    }
}
