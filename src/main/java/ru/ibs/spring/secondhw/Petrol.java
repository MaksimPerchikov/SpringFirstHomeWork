package ru.ibs.spring.secondhw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.spring.firsthw.Engine;

@Service
public class Petrol implements ru.ibs.spring.firsthw.Engine {
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
