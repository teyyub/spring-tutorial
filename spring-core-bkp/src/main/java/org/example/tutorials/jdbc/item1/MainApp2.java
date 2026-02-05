package org.example.tutorials.jdbc.item1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Access JdbcTemplate bean
//        JdbcTemplate jdbcTemplate =(JdbcTemplate) context.getBean("jdbcTemp");

        // You can now use jdbcTemplate to interact with the database
//        System.out.println("JdbcTemplate is ready to use.");
        StudentRepository studentService =(StudentRepository) context.getBean("srepo");

    }
}
