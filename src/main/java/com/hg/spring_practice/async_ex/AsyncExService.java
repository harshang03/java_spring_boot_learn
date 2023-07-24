package com.hg.spring_practice.async_ex;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncExService {
    @Async
    public void doAsyncTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds to simulate the task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Async task is completed.");
    }
}
