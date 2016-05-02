package com.test13.www;

/**
 * Created by Ivan on 4/24/2016.
 */
public class ClassA extends Thread {

    int i;

    public ClassA(int i) {

        this.i = i;
    }

    @Override
    public void run() {
        while(i<10) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("run in thread A- " + i);
            i++;
        }
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "i=" + i +
                '}';
    }
}
