package ru.ibs.spring.secondhw;

import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class BeansCla {

    public HashMap<String, Engine> BeansCla() {
        HashMap<String, Engine> engineHashMap = new HashMap<>();
        engineHashMap.put("petrol",new Petrol());
        engineHashMap.put("diesel",new Diesel());
        return engineHashMap;
    }
}
