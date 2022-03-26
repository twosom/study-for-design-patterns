package com.icloud.abstract_factory.java;

import com.icloud.factorymethod.after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
        System.out.println(whiteship.getName());

        applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);

        System.out.println(applicationContext.getBean("shipFactory", Ship.class)
                .getName());
    }
}
