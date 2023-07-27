package com.spring.udemy.ServiceImpl;

import com.spring.udemy.Services.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    public void rotate() {
        System.out.println("The tyre is bridgestone");
    }
}

