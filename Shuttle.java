package com.hillel.kuchmii.lessons.lesson6;

public class Shuttle {
    public static void main(String[] args) {
        int counter = 0;
        int cursor = 0;
        while (counter < 100) {
            cursor++;
            if (cursor % 10 == 4 || cursor % 10 == 9 || cursor / 10 == 4 || cursor / 10 == 9 || cursor % 100 == 4 || cursor % 100 == 9 || cursor / 10 % 10 == 4) {
                continue;
            }
            System.out.println("Shuttle number: " + cursor);
            counter++;
        }
        System.out.println();
        System.out.println("Total numbers = " + counter);
    }
}
