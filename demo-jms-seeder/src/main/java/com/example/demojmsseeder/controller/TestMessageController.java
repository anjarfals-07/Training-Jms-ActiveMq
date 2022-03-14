package com.example.demojmsseeder.controller;

import com.example.demojmsseeder.model.NotificationMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessageController {
    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping("/send")
    private void send() {
        NotificationMessage notif = new NotificationMessage();
        notif.setMessage("Ada pesan baru");
        jmsTemplate.convertAndSend("Hallo-Muhammad-Anjar", notif);

    }
}