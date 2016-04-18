package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public enum Moth {

    DECEMBER(Season.WINTER,31),
    JANUARY(Season.WINTER,31),
    FEB(Season.WINTER,29),
    MARCH(Season.SPRING,30),
    APR(Season.SPRING,30),
    MAY(Season.SPRING,30),
    JUNE(Season.SUMMER,30),
    JUL(Season.SUMMER,30),
    AUG(Season.SUMMER,30),
    SEPTEMBER(Season.AUTUMN,30),
    OKT(Season.AUTUMN,30),
    NOV(Season.AUTUMN,30);

    Season season;
    int days;

    private Moth(Season season, int days){
        this.season = season;
        this.days=days;

    }

    @Override
    public String toString() {
        return "Moth- "+ this.name() +
                " season=" + season +
                ", days=" + days +
                '}';
    }
}
