package com.test11.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Ivan on 4/13/2016.
 */

/// Inner
public class Test11 {
    public static void main(String []a){
        Person1 [] person1s = {new Person1("a"),new Person1("b"), new Person1("s"), new Person1("q"), new Person1("h")};

        MyCollection myCollection = new MyCollection();
        myCollection.x=person1s;
        MyCollection.MyCollectionInner inner = myCollection.new MyCollectionInner();
        inner.next();


//        Person1.StaticInner staticInner = new Person1.StaticInner();
        Person1 person1 = new Person1("aaa");
        Person1.StaticInner staticInner1 = person1.new StaticInner();


        ArrayList<Person1> person1ArrayList = new ArrayList<>();
        person1ArrayList.add(new Person1("serj"));
        person1ArrayList.add(new Person1("merj"));
        person1ArrayList.add(new Person1("berj"));

        Collections.sort(person1ArrayList, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(person1ArrayList);
    }
/*
    Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next(). Створити клас Collection,в якого оголосити
    як поле масив типу Object. Створити конструктор з визначеними параметрами куди передати даний масив.
    Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator. Перевизначити методи так щоб:
            •	Перший клас виводив значення масиву від першого до останнього.*/

    static void metttt(){
        class LocalClass{

            String s = "hello";
        }
        String ddd = new LocalClass().s;
    }


}
