package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Wheel {

    int radius;
    int profile;

    public Wheel(int radius, int profile) {
        this.radius = radius;
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", profile=" + profile +
                '}';
    }

    public void wheelMethod(int howMuch){
        System.out.println("наше колесо спустило на - " + howMuch + " бар");
    }
}
