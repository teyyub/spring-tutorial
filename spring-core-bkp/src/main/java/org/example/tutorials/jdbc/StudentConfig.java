package org.example.tutorials.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class StudentConfig {

    @Bean
    public StudentController controller(){

        return new StudentController(service());
    }

    @Bean
    public StudentService service(){

        return new StudentService(repository());
    }

    @Bean
    public StudentJDBCTemplate repository(){
        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        return studentJDBCTemplate;
    }
}
