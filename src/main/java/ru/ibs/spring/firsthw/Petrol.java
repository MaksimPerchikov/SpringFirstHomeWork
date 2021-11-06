package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Petrol implements Engine{
    /*private EngineImpl engineImpl;
    Petrol(EngineImpl engineImpl){
        this.engineImpl = engineImpl;
    }*/
    @Override
    public String powerUp() {
        return "Работает на бензине.";
    }

}
