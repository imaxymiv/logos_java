package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public class Workers implements SalaryCalculator {

    @Override
    public int salaryPerHour(int a, int b, int x) {
        return (a / b) / x;
    }

    @Override
    public int monthSalary(int hours, int days) {
        return hours * days;
    }
}
