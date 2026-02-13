package org.example.tutorials.dtos;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class TicketMachine {

    public void processTicket() {
        Ticket ticket = getNewTicket();
        System.out.println("Yeni biletin seriyası: " + ticket.getSerialNumber());
    }

    @Lookup // Spring bu metodu override edəcək və konteynerdən yeni Ticket gətirəcək
    public Ticket getNewTicket() {
        return null;
    }
}
