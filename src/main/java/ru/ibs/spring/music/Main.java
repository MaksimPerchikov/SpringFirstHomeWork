package ru.ibs.spring.music;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.spring.music");

        MusicImplements musicImplements = applicationContext.getBean("musicImplements",MusicImplements.class);
        musicImplements.showSong();
    }
}
