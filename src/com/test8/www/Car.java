package com.test8.www;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 3/21/2016.
 */
public class Car {

    String name;
    int year;
    int hp;
    List<Car> cars = new ArrayList<>();

    public Car() {
    }

    public Car(String name, int year, int hp) {
        this.name = name;
        this.year = year;
        this.hp = hp;
    }

    public void addToList(Car c ){
        cars.add(c);
    }

    public void remFromLIst(int i){
        cars.remove(i);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                ", cars=" + cars +
                '}';
    }
}
