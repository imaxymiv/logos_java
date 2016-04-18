package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public  class ClassA implements Default,NextInterface {
    @Override
    public int some(int a, int b) {
        int c = a-b;
        return c;
    }

    @Override
    public void someMethod() {

    }
}
