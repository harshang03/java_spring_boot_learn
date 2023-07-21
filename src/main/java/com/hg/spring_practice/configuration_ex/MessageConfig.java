package com.hg.spring_practice.configuration_ex;

public class MessageConfig {
    private String message;

    public MessageConfig(String message) {
        this.message = message;
    }
    public void showMessage() {
        System.out.println("Message: " + message);
    }
}
