package ru.ibs.spring.secondhw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.spring.firsthw.Engine;

@Service
public class Diesel implements ru.ibs.spring.firsthw.Engine {
    @Autowired
    private Engine engine;

    private ru.ibs.spring.firsthw.Diesel diesel;


    @Override
    public void powerUpSecondVersion() {
        System.out.println(engine.getClass()+ " Работает на дизеле." );
    }

    //пока что не нужно.
    @Override
    public String powerUp() {
        return  "Работает на дизеле.";
    }
}