package com.hg.spring_practice.primary_ex;

import org.springframework.beans.factory.annotation.Autowired;

public class CarService{
    @Autowired
    Car car;
    public Car getCar(){
        return car;
    }
    public void setCar(Car car){
        this.car = car;
    }
}
