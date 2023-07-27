package com.spring.udemy.ServiceImpl;

import com.spring.udemy.Services.MusicPlayer;
import com.spring.udemy.Services.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    @Autowired
    MusicPlayer musicPlayer;
    @Autowired
    Tyres tyres;

    public void playMusic(){
        musicPlayer.makeSound();
    }
    public void showTyre(){
        tyres.rotate();
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
