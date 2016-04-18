package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public class SonOfPerson extends Person {

    int wallet;

    public SonOfPerson(int age, String gender, int salary, int wallet) {
        super(age, gender, salary);
        this.wallet = wallet;
    }

    public SonOfPerson(int wallet) {

        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return super.toString() + "SonOfPerson{" +
                "wallet=" + wallet +
                '}';
    }

    @Override
    public void fathersMetod() {
        System.out.println("Son metod");
    }

    public void sonsMetod(){}
}
