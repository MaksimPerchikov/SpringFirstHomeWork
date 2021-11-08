package ru.ibs.spring.secondhw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.spring.secondhw.Engine;

@Service
public class Petrol implements Engine {

    @Autowired
    private Petrol petrol;

    @Override
    public String powerUp() {
        return "Работает на бензине.";
    }

}
