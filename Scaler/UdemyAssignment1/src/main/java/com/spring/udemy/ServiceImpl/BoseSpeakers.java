package com.spring.udemy.ServiceImpl;

import com.spring.udemy.Services.MusicPlayer;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements MusicPlayer {
    public void makeSound() {
        System.out.println("Bose Speakers");
    }
}
