package com.example.demojmsseeder.model;

import java.io.Serializable;

public class NotificationMessage implements Serializable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
