package com.hg.spring_practice.qualifier_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private final Animal animal;
    public AnimalService(@Autowired @Qualifier("cat") Animal animal) {
        this.animal = animal;
    }
    public void playSound() {
        animal.makeSound();
    }
}