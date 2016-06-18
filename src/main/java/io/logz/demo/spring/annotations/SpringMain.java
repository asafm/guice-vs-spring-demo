package io.logz.demo.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.logz.demo.spring.annotations");
        MyAppStarter myAppStarter = context.getBean(MyAppStarter.class);
        myAppStarter.start();
    }


}
