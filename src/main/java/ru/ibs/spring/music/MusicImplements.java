package ru.ibs.spring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class MusicImplements {

    private Music music;
    private Music music1;
    private ClassicalMusic classicalMusic;
    private PhonkMusic phonkMusic;

    @Autowired
    public MusicImplements(@Qualifier("phonkMusic")Music music,
                           @Qualifier("classicalMusic")Music music1){
        this.music = music;
        this.music1 = music1;
    }

    public void setMusic(Music music) {
        this.music = music;
    }


    public MusicImplements(ClassicalMusic classicalMusic,PhonkMusic phonkMusic){
        this.classicalMusic = classicalMusic;
        this.phonkMusic = phonkMusic;
    }

    /*public void showSong(){
        System.out.println(classicalMusic.getClass()
                +" "+classicalMusic.song()
                +" , "+phonkMusic.getClass()
                +" "+phonkMusic.song());
    }*/
   /* public void showSong(){
        System.out.println(music.getClass()+": "+music.song());
    }
*/
    public void showSong(){
        System.out.println(music.getClass()
                +" "+music.song()
                +" , "+music1.getClass()
                +" "+music1.song());
    }

}
