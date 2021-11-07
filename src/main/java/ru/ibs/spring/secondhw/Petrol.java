package ru.ibs.spring.secondhw;


import org.springframework.stereotype.Service;

@Service
public class Petrol implements Engine{
    @Override
    public String powerUp() {
        return "на бензине";
    }
}
