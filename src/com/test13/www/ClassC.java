package com.test13.www;

/**
 * Created by Ivan on 4/24/2016.
 */
public class ClassC implements Runnable{
    int x;
    Thread thread;
    int sleep;

    public ClassC(int x, int sleep) {
        this.x = x;
        thread = new Thread(this);
        this.sleep=sleep;
        thread.start();
    }


    @Override
    public void run() {
        while(x<15) {
            try {
                Thread.currentThread().sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run in thread c - " + x);
            x++;
        }
    }
}
