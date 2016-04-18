package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public abstract class Person {
    int age;
    String gender;
    int salary;

    public Person(){

    }

    public Person( int age,String gender, int salary) {
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract void fathersMetod();
}
