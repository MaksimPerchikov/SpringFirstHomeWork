package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Petrol implements Engine{
    @Autowired
    private Engine engine;

    @Override
    public void powerUpSecondVersion() {
        System.out.println(engine.getClass()+ " Работает на бензине." );
    }

    @Override
    public String powerUp() {
        return "Работает на бензине.";
    }

}
