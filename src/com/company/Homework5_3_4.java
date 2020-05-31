package com.company;

import java.util.Scanner;

public class Homework5_3_4 {

    public static void main(String[] args) {

        // Task 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Insert second number: ");
        int number2 = scanner.nextInt();

        productOfTwoNumbers(number1, number2);

        cubeOfProductOfTwoNumbers(number1, number2);


        // Task 4

        System.out.println("Insert first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Insert third number: ");
        int numberThree = scanner.nextInt();

        System.out.println("The smallest number is ");
        smallestAmongThreeNumbers(numberOne, numberTwo, numberThree);

    }

    // Methods of task 3

    public static void productOfTwoNumbers(int number1, int number2) {
        int prod = number1 * number2;
        System.out.println("The product of " + number1 + " and " + number2 + " is " + prod);
    }

    public static void cubeOfProductOfTwoNumbers(int number1, int number2) {
        int prod = number1 * number2;
        int cube = prod * prod * prod;
        System.out.println("The cube of the " + prod + " is " + cube);
    }


    //Method of task 4

    public static void smallestAmongThreeNumbers(int number1, int number2, int number3) {
        System.out.println(Math.min(Math.min(number1, number2), number3));
    }

}
