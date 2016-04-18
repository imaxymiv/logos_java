package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public class PersonWorker extends Workers{

    int days;
    int hours;
    int salary;

    public PersonWorker(int days, int hours, int salary) {
        this.days = days;
        this.hours = hours;
        this.salary = salary;
    }

    @Override
    public int salaryPerHour(int a, int b, int x) {
        return super.salaryPerHour(a, b, x);
    }
}
