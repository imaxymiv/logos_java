package com.test3.www;

import java.util.Scanner;

/**
 * Created by Ivan on 2/25/2016.
 */
public class Person {

    private int age; /*0*/
    private String name; /*null*/
    private  int id ;
    static int count;

    public Person(){

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Vanya is our hero!");
         this.id=count++;
    }

    @Override
    public String toString() {
        return "age is -" + age + " " + "name is -" + name + " id - " + this.id;
    }

    public void calculator(int a, int b){
        System.out.println(a+b);
    }

    public int getAge() {

            return age;


    }

    public void setAge(int age) {
        if(new Scanner(System.in).nextLine().equals("Q")){
            this.age = age;
        }else {
            this.age = 0;
        }
    }

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }*/
}
