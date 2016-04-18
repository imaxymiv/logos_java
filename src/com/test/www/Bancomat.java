package com.test.www;

import java.util.Scanner;

public class Bancomat {
    static int ballance = 50000;

    public static void main(String arg[]) {
        //1 validation
        //while(true)
        //2menu
        //21 ballance -> int ballance
        //22 getCash() -> bla
        //23  setCash() - > ball;
        //24 exit
        for (int x = 0; x <= 2; x++)
            if (scanStr().equals("1111")) {
                menu();
                return;
            } else {
                System.out.println("Wrong password");
            }
        System.out.println("Eat card");
    }

    public static int scanner() {
        System.out.println("enter a num");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static String scanStr() {
        System.out.println("enter password");
        return new Scanner(System.in).nextLine();
    }

    public static void showBallance() {
        System.out.println(ballance);
    }

    public static void menu() {
        while (true) {
            switch (scanner()) {

                case 1:
                    showBallance();
                    break;
                case 2:
                    int temp = scanner();
                    if (temp <= ballance) {
                        ballance = ballance - temp;
                        showBallance();
                    }
                    break;
                case 3:
                    int temp2 = scanner();
                    if (temp2 > 0) {
                        ballance = ballance + temp2;
                        showBallance();
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}

