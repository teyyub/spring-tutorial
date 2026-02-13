package org.example.tutorials.dtos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ticket {
    private String serialNumber = java.util.UUID.randomUUID().toString();

    public String getSerialNumber() {
        return serialNumber;
    }
}
