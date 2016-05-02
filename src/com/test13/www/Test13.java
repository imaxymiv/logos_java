package com.test13.www;

/**
 * Created by Ivan on 4/24/2016.
 *
 *
 * Потоки
 */
public class Test13 {

    static int i = 0;
    public static void main(String args []) throws InterruptedException {
        System.out.println("main begin");

        ClassA classA = new ClassA(i);
        Thread a = new Thread(classA);
        a.start();

        ClassB classB = new ClassB(i);
        Thread b = new Thread(classB);
        b.start();

        ClassC classC = new ClassC(i,900);

        try {
            classC.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end");
    }

}
