package com.test10.www;

import com.test3.www.Person;
import com.test6.www.*;


import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by Ivan on 3/24/2016.
 */
public class Test10 {
    public static void main(String[] arr) throws IOException, ClassNotFoundException {

/*
        File file = new File("f1.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String str = "hello";
//        byte[] b = {1, 2, 3, 4, 5};
        byte b [] = str.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
        int i;

        while((i = fileInputStream.read())!=-1){
            System.out.println(Character.toChars(i));
        }*/

        /*File file2 = new File("f2.txt");

        FileWriter fileWriter = new FileWriter(file2,true);
        fileWriter.write("Hello");
        fileWriter.flush();
        fileWriter.close();


        FileReader fileReader = new FileReader(file2);
        int i2;
        while((i2 = fileReader.read())!=-1){
            System.out.println(Character.toChars(i2));
        }*/

//        File file3 = new File("f3.txt");
//        PrintWriter printWriter = new PrintWriter(file3);
//        printWriter.println("Djjgsjdfg");
//        printWriter.println("Ohiop");
//        printWriter.println(new Car("BMW", 1990));
//        printWriter.flush();
//        printWriter.close();
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file3));
////        System.out.println( bufferedReader.readLine());
////        System.out.println( bufferedReader.readLine());
////        System.out.println( bufferedReader.readLine());
//
//        String s;
//        while((s=bufferedReader.readLine())!=null){
//            System.out.println(s);
//
//        }



//        File file4 = new File("f4.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file4));
//        objectOutputStream.writeObject(new com.test10.www.Car("BMW", 2016));
//        objectOutputStream.flush();
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file4));
//
//        while (objectInputStream != null) {
//
//            try {
//                Car temp=(Car) objectInputStream.readObject();
//                System.out.println(temp.name);
//
//            }catch (EOFException e){
//                System.out.println("file end");
//            }
//            break;
//        }



        File fileImage = new File("6779436-cat-images.jpg");
        BufferedImage bufferedImage = ImageIO.read(fileImage);



        File fileImageOuter = new File("oterImage.jpeg");
        String format = "jpeg";
        ImageIO.write(bufferedImage,format,fileImageOuter);

    }
}

//vivtorok na 12 (4 kvitn'a)
