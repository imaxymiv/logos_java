package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Manufacturer {

    String country;
    int code;

    public Manufacturer(String country, int code) {
        this.country = country;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "country='" + country + '\'' +
                ", code=" + code +
                '}';
    }

    public void batteryParameters() {
        System.out.println("Producer" + country + " " + "Code" + code);
    }

}
