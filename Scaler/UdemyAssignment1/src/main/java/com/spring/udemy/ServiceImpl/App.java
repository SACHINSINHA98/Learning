package com.spring.udemy.ServiceImpl;

import com.spring.udemy.ServiceImpl.Person;
import com.spring.udemy.ServiceImpl.Vehicle;
import com.spring.udemy.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().showTyre();
    }
}
