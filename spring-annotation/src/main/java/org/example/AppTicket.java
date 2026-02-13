package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.tutorials.config.ProjectConfig;
import org.example.tutorials.dtos.Person;
import org.example.tutorials.dtos.TicketMachine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTicket {
    private static final Log log = LogFactory.getLog(AppTicket.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        TicketMachine machine = context.getBean(TicketMachine.class);
        machine.processTicket(); // Məsələn: seriya-123
        machine.processTicket();

    }
}
