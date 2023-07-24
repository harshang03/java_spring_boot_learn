package com.hg.spring_practice;

import com.hg.spring_practice.async_ex.AsyncExService;
import com.hg.spring_practice.configuration_ex.MessageConfig;
import com.hg.spring_practice.lazy_ex.LazyEx;
import com.hg.spring_practice.post_counstruct_and_pre_destroy_ex.PostConstructAndPreDestroyEx;
import com.hg.spring_practice.qualifier_ex.AnimalService;
import com.hg.spring_practice.value_ex.ValueEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringPracticeApplication {
    @Autowired
    AsyncExService asyncExService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
        // for @configuration
        MessageConfig msg = context.getBean(MessageConfig.class);
        msg.showMessage();

        //for @Qualifier
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.playSound();

        //for @value
        ValueEx valueEx = context.getBean(ValueEx.class);
        System.out.println(valueEx.show());

        //for @PostConstruct and @preDestroy
        PostConstructAndPreDestroyEx pos = context.getBean(PostConstructAndPreDestroyEx.class);
        pos.showMessage();
        //context.close();

        //for @Lazy
        LazyEx lazyEx = context.getBean(LazyEx.class);
        lazyEx.display();

        //for @Async
        SpringPracticeApplication app = context.getBean(SpringPracticeApplication.class);
        app.executeAsyncTask();
    }

    public void executeAsyncTask() {
        System.out.println("Starting async task...");
        asyncExService.doAsyncTask();
        System.out.println("Async task request submitted.");
    }
}
