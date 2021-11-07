package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Diesel implements Engine{
    @Autowired
    private Engine engine;

    private Diesel diesel;


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
