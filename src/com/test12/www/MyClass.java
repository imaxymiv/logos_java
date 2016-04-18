package com.test12.www;

import com.sun.org.apache.xpath.internal.operations.Number;

/**
 * Created by Ivan on 4/16/2016.
 */
public class MyClass<K extends java.lang.Number,V extends java.lang.Number> {

    private K k;
    private V v;

    public MyClass(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public MyClass() {

    }


    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {

        return k;
    }

    public V getV() {
        return v;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
