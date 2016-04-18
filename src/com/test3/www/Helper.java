package com.test3.www;

import java.util.Random;

/**
 * Created by Ivan on 2/25/2016.
 */
public class Helper {

    public int [] randomizer(int size, int diapazon){
       int [] arr = new int [size];
        for (int i=0;i<arr.length;i++){
            arr[i] = new Random().nextInt(diapazon);

        }
        return arr;

    }

    public void printer(int [] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
