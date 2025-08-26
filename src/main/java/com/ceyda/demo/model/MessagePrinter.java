package com.ceyda.demo.model;


import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    public void printMessage(){
        System.out.println("Hello Spring Boot!");
    }
}
