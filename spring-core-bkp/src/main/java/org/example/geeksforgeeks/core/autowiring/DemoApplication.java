package org.example.geeksforgeeks.core.autowiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/geeks/wired.xml");
        City cty = context.getBean("city", City.class);
        cty.setId(011);
        cty.setName("Varanasi1");

        City cty1 = context.getBean("city", City.class);
        System.out.println(cty1==cty);
        System.out.println(cty1.equals(cty));
//        State st = context.getBean("state", State.class);
//        st.setName("UP");
////        cty.setState(st);
//        cty.showCityDetails();
    }
}

