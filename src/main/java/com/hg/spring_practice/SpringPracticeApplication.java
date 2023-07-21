package com.hg.spring_practice;

import com.hg.spring_practice.configuration_ex.MessageConfig;
import com.hg.spring_practice.entity.Student;
import com.hg.spring_practice.post_counstruct_ex.PostConstructEx;
import com.hg.spring_practice.qualifier_ex.AnimalService;
import com.hg.spring_practice.value_ex.ValueEx;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringPracticeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
        // for @configuration
        MessageConfig msg = context.getBean(MessageConfig.class);
        msg.showMessage();

        //for @Qualifier
        AnimalService animalService =context.getBean(AnimalService.class);
        animalService.playSound();

        //for @value
        ValueEx valueEx = context.getBean(ValueEx.class);
        System.out.println(valueEx.show());

        //for @PostConstruct
        PostConstructEx pos = context.getBean(PostConstructEx.class);
        pos.showMessage();


    }
}
