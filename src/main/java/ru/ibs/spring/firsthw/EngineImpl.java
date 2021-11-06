package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EngineImpl {

    private Engine engine;
    private Diesel diesel;
    private Petrol petrol;

    @Autowired
    EngineImpl(Diesel diesel,Petrol petrol){
        this.diesel = diesel;
        this.petrol = petrol;
    }


    public void show(){
        System.out.println(diesel.getClass()+": "+ diesel.powerUp());
        System.out.println(petrol.getClass()+": "+ petrol.powerUp());
    }
}
