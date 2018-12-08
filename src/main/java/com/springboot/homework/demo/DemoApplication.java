package com.springboot.homework.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


import com.springboot.homework.demo.AppConfig;
import com.springboot.homework.demo.Application;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);

        //Byname Autowiring
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : "+application);

        // ByType Autowiring
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details : " + employee);

        // By Constructor Autowiring
        Performer performer = (Performer) context.getBean("performer");
        System.out.println("Performer Details : " + performer);

        Driver driver = (Driver) context.getBean("driver");
        System.out.println("Driver Details : " + driver);

        Bond bond = (Bond) context.getBean("bond");
        bond.showCar();
    }
}
