package io.logz.demo.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo-applicationContext.xml");
        MyAppStarter myAppStarter = context.getBean(MyAppStarter.class);
        myAppStarter.start();
    }
}
