package com.test3.www;

import java.util.Arrays;

/**
 * Created by Ivan on 2/25/2016.
 */
public class Test3 {
    public static void main(String[] args){
         Person p = new Person();
//        System.out.println(p.age + " " + p.name);

        Person p2 = new Person(28,"Serj");
        Person p3 = new Person(28,"Serj");
        System.out.println(p2);
        System.out.println(p3 + "sdf");
//        System.out.println(p2.age + " " + p2.name);
//        System.out.println(Person.getId());
//        System.out.println(Person.getId());

        Person person = new Person();
        person.calculator(5,10);

        Helper h = new Helper();
        int arr[] = h.randomizer(5,100);

        h.printer(arr);
//        int i =Property.someInteger;


        System.out.println(p2.getAge());
        p2.setAge(15);
        System.out.println(p2.getAge());

    }
}
