package ru.ibs.spring.music;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
/*@Primary*/
public class PhonkMusic implements Music{
    @Override
    public String song() {
        return "Фонк";
    }
}
