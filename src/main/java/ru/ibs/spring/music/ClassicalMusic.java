package ru.ibs.spring.music;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ClassicalMusic implements Music{

    @Override
    public String song(){
        return "Классическая музыка";
    }
}
