package com.test7.www;

/**
 * Created by Ivan on 3/16/2016.
 */
public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        int comp = this.age - o.age;
        if (comp == 0) {
            comp = this.name.compareTo(o.name);
            return comp;
        }
        return comp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
