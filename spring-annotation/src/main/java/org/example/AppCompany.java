package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.tutorials.config.ProjectConfig;
import org.example.tutorials.dtos.Company;
import org.example.tutorials.dtos.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCompany {
    private static final Log log = LogFactory.getLog(AppCompany.class);

    public static void main(String[] args) {
        System.out.println("1. Spring Konteyneri başladılır...");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("2. Spring Konteyneri artıq hazırdır!");
        Company c = context.getBean(Company.class);
//         c.showManager();

    }
}
