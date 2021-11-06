package ru.ibs.spring.firsthw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Diesel implements Engine{
  /*  private EngineImpl engineImpl;
    Diesel(EngineImpl engineImpl){
        this.engineImpl = engineImpl;
    }*/

    @Override
    public String powerUp() {
      return  "Работает на дизеле.";
    }
}
