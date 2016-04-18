package com.test9.www;

/**
 * Created by Ivan on 3/21/2016.
 */
public class Test9 {

    public static void main(String [] a){

        int i = 0;
        int x = 10;


        try{
            MyClass.mmm(0);
        }catch (ArithmeticException e){
            System.out.println("/ by ZERO");
            e.printStackTrace();
            
        }finally {

        }
        System.out.println("marker");

    }


        public void asdad() throws  ArithmeticException{
        MyClass.mmm(0);
    }
}
