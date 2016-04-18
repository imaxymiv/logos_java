package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Battery {

    private Manufacturer manufacturer;
    private int volume;

    public Battery(Manufacturer manufacturer, int volume) {
        this.manufacturer = manufacturer;
        this.volume = volume;
    }

    public Battery(String country, int code, int volume) {
        this.manufacturer = new Manufacturer(country, code);
        this.volume = volume;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getVolume() {
        return volume;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "manufacturer=" + manufacturer +
                ", volume=" + volume +
                '}';
    }
}
