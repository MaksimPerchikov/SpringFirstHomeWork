package ru.ibs.spring.secondhw;

import org.springframework.stereotype.Service;

@Service
public class Diesel implements Engine{
    @Override
    public String powerUp() {
        return "на дизельном топливе!";
    }
}
