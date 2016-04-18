package com.test10.www;

import java.io.Serializable;

/**
 * Created by Ivan on 3/24/2016.
 */
public class Car implements Serializable{
   /*transient*/ String name;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
