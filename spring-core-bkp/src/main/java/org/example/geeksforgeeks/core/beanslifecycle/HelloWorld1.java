package org.example.geeksforgeeks.core.beanslifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld1 implements InitializingBean, DisposableBean {

    // This method executes
    // automatically as the bean
    // is instantiated
    public void init1()
    {
        System.out.println(
                "Bean HelloWorld1 has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    // This method executes
    // when the spring container
    // is closed
    public void destroy()
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(
                "Bean HelloWorld1 has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }
}
