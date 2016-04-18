package com.test12.www;

/**
 * Created by Ivan on 4/16/2016.
 */
public class PersonQ {

    private String name;
    public int age;
    int x;

    public PersonQ(String name, int age, int x) {
        this.name = name;
        this.age = age;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "PersonQ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", x=" + x +
                '}';
    }
}
