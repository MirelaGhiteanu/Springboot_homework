package com.springboot.homework.demo;

import org.springframework.stereotype.Component;

@Component("Ferari")
public class Ferrari implements Car{
    public void getCarName() {
        System.out.println("This is Ferari");
    }
}
