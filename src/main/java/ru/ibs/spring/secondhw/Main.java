package ru.ibs.spring.secondhw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class,args);
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.spring.secondhw");
        //1*
        //Первая версия.Вы уже проверяли,ниже по-новому сделал
       // Engine enginePetrol = applicationContext.getBean("petrol", Petrol.class);
       // enginePetrol.powerUpSecondVersion();
       // Engine engineDiesel = applicationContext.getBean("diesel",Diesel.class);
       // engineDiesel.powerUpSecondVersion();
//===============================================================================================================



        //2*
        //следубщая версия.Сделал новый подход,подумал,инетерсное что-то может получится
        /*List<Engine> engineList = new ArrayList<>();
        engineList.add(applicationContext.getBean("diesel", Diesel.class));
        engineList.add(applicationContext.getBean("petrol",Petrol.class));
        for (Engine engine :engineList) {
            System.out.println(engine.getClass()+" "+engine.powerUp());
        }*/



        //3*
        //Использование чисто без интерфейса Engine
        /*Diesel diesel1 = applicationContext.getBean("diesel",Diesel.class);
        Petrol petrol1 = applicationContext.getBean("petrol",Petrol.class);
        System.out.println(diesel1.powerUp());
        System.out.println(petrol1.powerUp());*/



    }


}
