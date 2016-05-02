package com.test13.www;

/**
 * Created by Ivan on 4/24/2016.
 */
public class ClassB implements Runnable{


    int j;

    public ClassB(int j) {
        this.j = j;
    }

    @Override
    public void run() {

        while(j<10){
            try {
                Thread.currentThread().sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("run in thread B -" + j);


            j++;
        }
    }
}
