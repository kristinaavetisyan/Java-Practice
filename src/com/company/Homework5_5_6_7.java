package com.company;

import java.util.Scanner;

public class Homework5_5_6_7 {
    public static void main(String[] args) {

        // Task 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string ");
        String string = scanner.nextLine();

        middleCharOfString(string);


        // Task 6

        System.out.println("Enter a sentence");
        String newString = scanner.nextLine();
        countWords(newString);

        // Task 7

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        checkLeapYear(year);

    }
    // Method of task 5

    public static void middleCharOfString(String string) {
        int length, position;

        if (string.length() % 2 == 0) {
            position = string.length() / 2 - 1;
            length = 2;
        } else {
            position = string.length() / 2;
            length = 1;
        }

        System.out.println(string.substring(position, position + length));

    }

    // Method of task 6

    public static void countWords(String string) {
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

    // Method of task 7

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
