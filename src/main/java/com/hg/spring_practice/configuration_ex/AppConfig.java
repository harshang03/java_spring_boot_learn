package com.hg.spring_practice.configuration_ex;

import com.hg.spring_practice.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MessageConfig messageService() {
        return new MessageConfig("Hello, Spring with @Configuration!");
    }
}
