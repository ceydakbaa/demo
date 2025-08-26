package com.ceyda.demo.service;


import com.ceyda.demo.model.MessagePrinter;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessagePrinter messagePrinter;

    public MessageService(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }
    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }
}
