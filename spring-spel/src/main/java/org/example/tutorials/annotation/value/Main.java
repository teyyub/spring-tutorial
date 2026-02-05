package org.example.tutorials.annotation.value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBean.class);
//        MyBean bean = context.getBean(MyBean.class);
//        bean.showMessage();  // Output: Hello, Spring!
//        context.close();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean bean = (MyBean) context.getBean("myBean");
        bean.showMessage();  // Output: Hello, Spring!
        context.close();
    }
}
