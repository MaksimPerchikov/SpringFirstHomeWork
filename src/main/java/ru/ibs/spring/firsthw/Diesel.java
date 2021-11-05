package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Diesel implements Engine {

    private Engine engine;

    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void powerUp() {
        System.out.println(getClass()+ " на дизеле");
    }
}
