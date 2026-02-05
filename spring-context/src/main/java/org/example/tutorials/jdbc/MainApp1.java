package org.example.tutorials.jdbc;

import org.example.tutorials.annotation.item1.TextEditorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
//
//        StudentJDBCTemplate studentJDBCTemplate =
//                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(StudentConfig.class);


        StudentController controller = ctx.getBean(StudentController.class);
        System.out.println("------Records Creation--------" );
        controller.create("Zara", 11);
        controller.create("Nuha", 2);
        controller.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = controller.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
//
        System.out.println("----Updating Record with ID = 2 -----" );
        controller.update(16,10);
//        studentJDBCTemplate.update(16, 20);
//
        System.out.println("----Listing Record with ID = 2 -----" );

//        Student student = studentJDBCTemplate.getStudent(9);
        Student student = controller.getStudent(9);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
}
