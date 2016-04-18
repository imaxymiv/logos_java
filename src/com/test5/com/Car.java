package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Car {
    String model;
    int hp;
    double voulume;
    Wheel wheel;

    public Car(String model, int hp, double voulume, Wheel wheel) {
        this.model = model;
        this.hp = hp;
        this.voulume = voulume;
        this.wheel = wheel;
    }


    public Car(String model, int hp, double voulume, int radius, int profile) {
        this.model = model;
        this.hp = hp;
        this.voulume = voulume;
        this.wheel = new Wheel(radius,profile);
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", voulume=" + voulume +
                ", wheel=" + wheel +
                '}';
    }

    public void wheelMethod(int howMuch){
        wheel.wheelMethod(howMuch);
    }
}
