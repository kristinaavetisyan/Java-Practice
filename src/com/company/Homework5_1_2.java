package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework5_1_2 {

    public static void main(String[] args) {

        // Task 1

        Random random = new Random();
        int numberOne = random.nextInt(100);
        int numberTwo = random.nextInt(100);

        sumOfTwoNumbers(numberOne, numberTwo);

        // Task 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Insert second number: ");
        int number2 = scanner.nextInt();

        productOfTwoNumbers(number1, number2);
    }

    public static void sumOfTwoNumbers (int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum);
    }


    public static void productOfTwoNumbers (int number1, int number2){
        int prod = number1 * number2;
        System.out.println("The product of " + number1 + " and " + number2 + " is " + prod);
    }

}
