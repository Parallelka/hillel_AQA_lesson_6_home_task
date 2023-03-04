package com.hillel.kuchmii.lessons.lesson6;

public class Shuttle {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) { //якщо включно число 100
            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9) {
                continue;
            }
            System.out.println("Shuttle number: " + i);
            counter++;
        }

        System.out.println();
        System.out.println("Total numbers = " + counter);
    }
}

//    У Японії числа 4 та 9 вважаються нещасливими.
//        Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть программу, яка виводить усі номери таких шатлів.