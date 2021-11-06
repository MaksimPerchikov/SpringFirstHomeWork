package ru.ibs.spring.firsthw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.spring.firsthw");
        EngineImpl engine = applicationContext.getBean("engineImpl",EngineImpl.class);
        engine.show();

    }
}
