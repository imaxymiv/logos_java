package com.test8.www;

import org.junit.*;
import org.junit.Assert.*;

import javax.xml.ws.soap.Addressing;

/**
 * Unit tests
 */
public class Test8 {

//    @Test
//    public void addTtoLstTes(){
//        Car car = new Car("subaru",2006,164);
//        int ex=1;
//        car.addToList(car);
//
//        Assert.assertEquals(ex, car.cars.size());
//
//
//    }

    static Car car;
    static Car c1;
    static Car c2;
    static Car c3;

    @BeforeClass
    public static void beforeClass() {
        car = new Car();

        c1 = new Car("aaa", 111, 111);
        c2 = new Car("bbb", 22, 222);
        c3 = new Car("ccc", 333, 222);
        System.out.println("beforeClass");
    }

    @Before
    public void before() {
        car.addToList(c1);
        car.addToList(c2);
        car.addToList(c3);
        System.out.println("before");
    }

    /*@Test*/

    @Test
    public void addToListTest(){
        car.addToList(new Car());
        Assert.assertEquals(4,car.cars.size());
        System.out.println("addToListTest");
    }

    @Test
    public void remFromListTest(){
        car.remFromLIst(0);
        Assert.assertEquals(2,car.cars.size());
        System.out.println("remFromListTest");
    }

    @After
    public void after() {

        car.cars.clear() ;
        System.out.println("after");;

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");

    }


}
