package com.hillel.kuchmii.lessons.lesson6;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        int i = 0;
        int a = 0;
        System.out.println("START!");
        while (i < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("my number = ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
            } else {
                System.out.println("IT IS NOT A NUMBER");
                continue;
            }
            if (a < 0 || a > 10) {
                System.out.println("INVALID NUMBER");
                continue;
            }
            int random = min + (int) (Math.random() * (max - min + 1));
            System.out.println("number robot = " + random);
            if (random == a) {
                System.out.println("WIN!");
                break;
            } else {
                System.out.println("FAIL!");
            }
            i++;
        }
    }
}

