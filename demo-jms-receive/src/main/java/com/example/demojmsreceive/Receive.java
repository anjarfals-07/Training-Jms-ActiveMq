package com.example.demojmsreceive;

import com.example.demojmsseeder.model.NotificationMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receive {

    @JmsListener(destination = "Hallo-Muhammad-Anjar", containerFactory = "myFactory")
    public void receiveMessage(NotificationMessage notification) {
        System.out.println("Received <" + notification.getMessage() + ">");
    }

}
