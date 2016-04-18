package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 *
 * Композиція
 * Агрегація
 *
 */
public class Test5 {
    public static void main(String [] args){

        Wheel wheel = new Wheel(15,55);
        Car car = new Car("zaz",110,1.6,wheel);
        wheel.wheelMethod(5);
        Car car2 = new Car("subaru",165,2,wheel);

        System.out.println(car);
        System.out.println(car2);


        Car car1 = new Car("mb",198,2.2,18,45);
        System.out.println(car1);

        Car car3 = new Car("bmw",190,2.5,new Wheel(17,50));
        car3.wheel.wheelMethod(5);

        car1.wheelMethod(50);

        Phone phone = new Phone("Nokia", "Gsm", "Finland", 564, 3000, 256, 262000);
        phone.changeResolution(6);
        System.out.println(phone);


        //телефон
            //модель
            //тип сигналу
           // батарея
              //виробник
                ////країна
                // код
             //ємкість
        // екран
            //розподільна здатність
            //кількість кольорів


        met1(Moth.MARCH);

        Moth [] m = Moth.values();
        for (Moth moth: m) {
            if(moth.days==31) System.out.println(moth);

        }

    }

    public static void met1(Moth s){
        System.out.println(s);
    }
}
