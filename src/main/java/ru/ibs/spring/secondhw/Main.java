package ru.ibs.spring.secondhw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.ibs.spring.secondhw");
        EngineImplements engineImplements = context.getBean("engineImplements",EngineImplements.class);
        engineImplements.showEng();


    }
}
