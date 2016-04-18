package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public interface SalaryCalculator {
    int montSalary = 3000;
    int workingDays = 20;
    int workingHours = 8;

    public int salaryPerHour(int a, int b, int x);

    public int monthSalary (int hours, int days);


}
