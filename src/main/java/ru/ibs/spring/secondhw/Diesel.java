package ru.ibs.spring.secondhw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.spring.secondhw.Engine;

@Service
public class Diesel implements Engine{
    @Autowired
    private Engine engine;

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