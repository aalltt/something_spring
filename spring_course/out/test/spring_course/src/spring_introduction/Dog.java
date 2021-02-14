package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Dog implements Pet {

    // private String name;


    public Dog() {
        System.out.println("Dog bean is created");
    }


    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Dog init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Dog destroy method");
//    }

}
