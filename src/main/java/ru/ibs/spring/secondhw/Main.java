package ru.ibs.spring.secondhw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.spring.secondhw");


        Diesel engineDiesel= applicationContext.getBean("diesel", Diesel.class);
        engineDiesel.powerUpSecondVersion();
        Engine enginePetrol = applicationContext.getBean("petrol", Petrol.class);
        enginePetrol.powerUpSecondVersion();
    }
}
