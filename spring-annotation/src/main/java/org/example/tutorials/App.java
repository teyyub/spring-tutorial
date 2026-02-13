package org.example.tutorials;

import org.example.tutorials.dtos.Part;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        // 1. Zavod (Factory) qurulur
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 2. XML-i oxuyan mexanizm işə düşür
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("warehouse/beans.xml"));

        // 3. Obyekti (Bean-i) istəyirik
        Part myPart = factory.getBean("enginePart", Part.class);

        myPart.info();
        // Çıxış: Hissə: V6 Mühərrik, Anbarın yeri: Bakı, Nərimanov r.
    }
}
