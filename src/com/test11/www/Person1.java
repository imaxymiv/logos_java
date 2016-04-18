package com.test11.www;

/**
 * Created by Ivan on 4/13/2016.
 */
public class Person1 {
    String name;

    public Person1(String name) {
    this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }

    static void met(){

        int i = 200;


//     int z=  new StaticInner().x;
}

     class StaticInner{
        int x = 100;


        void innermet(){
            met();
        }

    }
}
