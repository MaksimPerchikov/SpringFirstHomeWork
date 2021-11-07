package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/*@Service
public class EngineImpl {

    private Engine engine;
    private Diesel diesel;
    private Petrol petrol;

    *//*@Autowired
    EngineImpl(Diesel diesel,Petrol petrol){
        this.diesel = diesel;
        this.petrol = petrol;
    }*//*
    @Autowired
    EngineImpl(@Qualifier("petrol")Petrol petrol,@Qualifier("diesel")Diesel diesel){
        this.petrol = petrol;
        this.diesel = diesel;
    }

    @PostConstruct
    private void starterApp(){
        System.out.println("The program is running!");
    }


    public void show(){
        System.out.println(diesel.getClass()+": "+ diesel.powerUp());
        System.out.println(petrol.getClass()+": "+ petrol.powerUp());
    }
}*/
