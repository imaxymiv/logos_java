package com.test.www;

/**
 * Created by Ivan on 2/18/2016.
 */
public class Start {
    public static void main(String [] args){

        /*int
        short
        float
        double
        byte;
        char
        */

        System.out.println();
        /*Integer
        Double;
        Character;
        Boolean;*/

        int a =1;
        int b = 4;
        boolean bb = a == b;
        if(bb || 6==6){
            System.out.println("a!=5");
        }else if(a>3){
            System.out.println("a>3");
        }else{
            System.out.println("a - vzagali fignya");
        }
        System.out.println(11%3);


        switch (1){

            case 55:
                break;
            default:
                break;

        }

        int count=0;
        while (count<10){
            System.out.println(count);
            count=count+1;


        }



    }
}
