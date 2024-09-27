package com.example.demo;

import org.springframework.context.annotation.Bean;


public class MyFirstClass {
    @Bean
    public String sayHello(){
        return "hello from first class";
    }
}
