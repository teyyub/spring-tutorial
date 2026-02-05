package org.example.geeksforgeeks.core.circulate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private BeanA beanA;

    @Autowired
    public BeanB(@Lazy BeanA beanA) {
        this.beanA = beanA;
    }
}
