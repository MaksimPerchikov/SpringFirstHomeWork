package ru.ibs.spring.secondhw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EngineImplements{

    private Engine engine;
    private Diesel diesel;
    private Petrol petrol;

    @Autowired
    EngineImplements(@Qualifier("diesel")Diesel diesel,
                     @Qualifier("petrol")Petrol petrol){
        this.diesel = diesel;
        this.petrol = petrol;

    }
    public void showEng(){
        System.out.println(diesel.getClass()+": "+diesel.powerUp());
        System.out.println(petrol.getClass()+": "+petrol.powerUp());
    }
}
