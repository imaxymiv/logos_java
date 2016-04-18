package com.test2.www;

import java.util.Scanner;

/**
 * Created by Ivan on 2/23/2016.
 */
public class Test2 {
    public static void main(String[] a) {
        String s1 = "heljolo";
        String s2 = "hello";
        System.out.println(s1 == s2);
        String sMain = new String("world!");
        String sMain2 = new String("world!");
        System.out.println(sMain == sMain2);
        System.out.println(sMain.equals(sMain2));

        System.out.println(s1.contains("l"));
        System.out.println(s1.charAt(1));
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.codePointBefore(1));
        System.out.println(s1.codePointCount(s1.indexOf("e"), s1.indexOf("o")));
        System.out.println(s1.compareTo("Hello"));
        System.out.println(s1.concat(" world"));
        System.out.println(s1 + " world");
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.hashCode());
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.intern());
        System.out.println(s1.isEmpty());
        String sss = "";
        System.out.println(sss.isEmpty());
        System.out.println(s1.lastIndexOf("l", 3));
        System.out.println(s1.lastIndexOf(s1.indexOf("l"), 5));
        System.out.println(s1.replace("l", "X"));
//        String [] arr = s1.split("l",2);
//        for(int i = 0; i<s1.length();i++){
//            System.out.println(arr[i]);
//        }

        System.out.println(s1.substring(2));
        char[] mas = s1.toCharArray();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(mas[i]);
        }

        System.out.println(s1);

        //зробити свій метод compareTo()
        // стрічки модуть бути різної довжини
        //якщо вони однакової довжини ->
        //якщо різні - по числах


    }

    public static void compareStrings(String x1, String x2) {

        String temp="";
        if (x1 == x2) {
            System.out.println("The same strings");
        }
        if (x1.length() == x2.length()) {
            if (x1.equals(x2)) {
                System.out.println("The same string");
            }
        } else {
//            char [] c = x1.toCharArray();
//            for(int i = 0; i<c.length;i++){
//                temp = temp +c[i];
//            }
            if((x1.hashCode()-x2.hashCode())>0){
                System.out.println("Greater 0");
            }else {
                System.out.println("Less 0");
            }
        }
    }
}
