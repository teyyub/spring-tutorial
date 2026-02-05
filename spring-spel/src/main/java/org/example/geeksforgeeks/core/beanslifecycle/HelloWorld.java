package org.example.geeksforgeeks.core.beanslifecycle;

public class HelloWorld {

    // This method executes
    // automatically as the bean
    // is instantiated
    public void init1()
    {
        System.out.println(
                "Bean HelloWorld has been "
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
}
