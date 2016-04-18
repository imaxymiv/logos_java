package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Phone {

    //телефон
    //модель
    //тип сигналу
    // батарея
    //виробник
    ////країна
    // код
    //ємкість
    // екран
    //розподільна здатність
    //кількість кольорів

    private String model;
    private String signal;
    private Battery battery;
    private Screen screen;

    public Phone(String model, String signal, Battery battery, Screen screen) {
        this.model = model;
        this.signal = signal;
        this.battery = battery;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", signal='" + signal + '\'' +
                ", battery=" + battery +
                ", screen=" + screen +
                '}';
    }

    public Phone(String model, String signal, String country, int code, int volume, int resolution, int rangeOfColors) {
        this.model = model;
        this.signal = signal;
        this.battery = new Battery(country, code, volume);
        this.screen = new Screen(resolution, rangeOfColors);
    }

    public void changeResolution(int n){
        screen.changeResolution(n);
    }
}
