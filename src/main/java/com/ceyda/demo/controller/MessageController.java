package com.ceyda.demo.controller;

import com.ceyda.demo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

   private final MessageService messageService;
   public MessageController(MessageService messageService){
       this.messageService = messageService;
   }

    @GetMapping("/message")
    public String getMessage(){
       return "Hello Spring Boot!";
    }
}
