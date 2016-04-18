package com.test12.www;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 4/16/2016.
 */

////// Generics, Reflection
public class Test12 {

    /*GENERICS*/

    public static void main(String [] args) throws NoSuchFieldException, IllegalAccessException {
//        MyClass<String,Integer> myClass = new MyClass<String,Integer>("HJfygf",12);
//        System.out.println(myClass);
//
//
//        MyClass<Integer,Integer> myClass1 = new MyClass<>(159,987);
//        System.out.println(myClass1);
//
//    List<Integer> integers = new ArrayList<>();
//        integers.add(5);
//        fdg(integers);
//
//    }
//
//    public static <T> T genMethod(T t){
//
//        return t;
//    }
//
//    public static void fdg(List<? extends Number> list){
////        list.add(5);
//        for(Object o: list) {
//            System.out.println(o);
//        }



        /*-------------------------------------*/
        //Reflection

        PersonQ personQ = new PersonQ("aaa ",25,52);

        Class aClass = personQ.getClass();

        System.out.println(Modifier.isPublic(aClass.getModifiers()));


        Class l = ArrayList.class;
        Class[]classes = l.getInterfaces();
        for (Class c :
                classes) {
            System.out.println(c);

        }
       Field field= aClass.getField("age");
        System.out.println(field.getName());
        System.out.println(field.getType());
        System.out.println(field.getInt(personQ));
        System.out.println();

        Field field2= aClass.getDeclaredField("name");
        System.out.println(field2.getName());
        System.out.println(field2.getType());
        field2.setAccessible(true);
        System.out.println(field2.get(personQ));
        field2.set(personQ,"UIGUGUG");
        System.out.println(personQ);


        Field[]fields = aClass.getDeclaredFields();

        for (Field field1 :
                fields) {
            System.out.println(field1.getType());
            System.out.println(field1.getName());
            System.out.println(field1.getModifiers());


        }


























    }



}
