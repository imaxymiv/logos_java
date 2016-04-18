package com.test4.com;

/**
 * Created by Ivan on 3/1/2016.
 */
public class Test4 {
    public static void main(String[] args) {
        //Person person = new Person(40, "male", 200);
        //System.out.println(person);


        SonOfPerson sop = new SonOfPerson(18, "Mark", 0, 50);

        sop.fathersMetod();

        Person [] arr = new Person [2];
        //arr[0] = person;
        arr[1] = sop;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

      Person p2 = new SonOfPerson(200);

        int x = Default.i;
        System.out.println(x);

        int xxx = new ClassA().some(5,200);
        System.out.println(xxx);

        Default[]mas = new Default[1];
        mas[0]=new ClassA();

        PersonWorker personWorker = new PersonWorker(22,12,5000);







    }

}
