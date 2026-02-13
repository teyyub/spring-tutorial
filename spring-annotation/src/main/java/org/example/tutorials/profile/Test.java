package org.example.tutorials.profile;

import org.example.tutorials.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProjectConfig.class);
        context.refresh();

        DBConnection db = context.getBean(DBConnection.class);
        db.connect(); // Çıxış:
    }
}
