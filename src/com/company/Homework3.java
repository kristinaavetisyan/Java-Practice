package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        /* 3.1 Write a program to display the first 20 natural numbers. */

        for (int items = 1; items <= 20; items++) {
            System.out.println(items);
        }

        /* 3.2 Write a program to display the first 20 natural numbers but exclude the ones that are divisible by 3. (using continue) */

        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        /* 3.3 Write a program to print the even numbers in range  {-20, +60} */

        for (int i = -20; i < 60; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /* 3.4 Write a program to print the odd numbers in range  {-20,  -60} */

        for (int i = -20; i < 60; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        /* 3.5 Write a program to find the sum of the first 100 natural numbers. */

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        /* 3.6 Write a program to find the sum of odd numbers of the first 100 natural numbers. */

        int sumOfOddNumbers = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 1){
                sumOfOddNumbers += i;
            }
        }
        System.out.println(sumOfOddNumbers);

        /* 3.7 Write a program to find the average of even numbers of the first 100 natural numbers. */

        int sumOfEvenNumbers = 0;

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                sumOfEvenNumbers += i;
            }
        }
        System.out.println(sumOfEvenNumbers);

        /* 3.8 Write a program to read 10 numbers from keyboard (console) and find their sum and average */

        int sumOfTenNumbers = 0, inputNumbers;
        double average;

        for (int i = 0; i < 10; i++) {

            Scanner scanner = new Scanner(System.in);
            inputNumbers = scanner.nextInt();
            System.out.println("Insert number");
            sumOfTenNumbers += inputNumbers;
        }
        average = sumOfTenNumbers / 10;
        System.out.println("The sum of numbers is " + sumOfTenNumbers + "\nThe average is " + average);

        /* 3.9 Write a program to display the cube of the number upto given integer. */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number is " + i + " and the cube of the " + i + " is " + (i*i*i));
        }


        /*  3.10 Write a program to display the multiplication table of a given integer */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to display the multiplication table: ");
        int numForMultiply = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiply = i * numForMultiply;
            System.out.println(numForMultiply + " x " + i + " = " + multiply);
        }

        /* 3.11 Write a program to determine whether a given number is prime or not. */

        System.out.println("Enter a number");
        int numIsPrime = scanner.nextInt();

        boolean isPrime = false;

        for (int i = 2; i < numIsPrime / 2; i++) {
            if (numIsPrime % i == 0){
                isPrime = true;
                break;
            }
        }
        if(!isPrime){
            System.out.println(numIsPrime + " is a prime number.");
        }else{
            System.out.println(numIsPrime + " is a not a prime number.");
        }

        /* 3.12 Write a program to display the first n Fibonacci series. */

        int fiboNum, first = 0, second = 1;

        System.out.println("Enter a number ");
        fiboNum = scanner.nextInt();

        System.out.print("Here is the Fibonacci series up to " + fiboNum + " terms: \n");

        for(int i = 1; i <= fiboNum; i++) {
            System.out.println(first + " ");

            int sumOfPreviousTwo = first + second;
            first = second;
            second = sumOfPreviousTwo;
        }

        /* 3.13 Write a program to print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ" in reverse order */

        System.out.println("Enter a string to be reversed");
        String initialStr = scanner.next();
        String reversedStr = "";

        for (int i = initialStr.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + initialStr.charAt(i);
        }
        System.out.println("Reversed string is: " + reversedStr);
    }
}
