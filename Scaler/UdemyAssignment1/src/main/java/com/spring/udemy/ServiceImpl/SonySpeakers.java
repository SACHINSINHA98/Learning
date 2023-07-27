package com.spring.udemy.ServiceImpl;

import com.spring.udemy.Services.MusicPlayer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements MusicPlayer {
    public void makeSound() {
        System.out.println("Sony Speakers");
    }
}
