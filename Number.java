package com.hillel.kuchmii.lessons.lesson6;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        int i = 0;
        System.out.println("START!");
        while (i < 3) {
            System.out.print("my number = ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
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

//Доп. (Scanner)
//
//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
//
//        Використовувати цикли!
