package com.company;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {


        /* 1.1 print the sum of two numbers. */

        int numOne = 74;
        int numTwo = 36;

        int sumOfNums = numOne + numTwo;

        System.out.println(sumOfNums);


        /* 1.2 .Divide two numbers and print on the screen. */

        int numThree = 50;
        int numFour = 3;

        int division = numThree / numFour;

        System.out.println(division);


        /* 1.3 Print the result of the following operations. */

        int opOne = -5 + 8 * 6;
        System.out.println(opOne);

        int opTwo = (55 + 9) % 9;
        System.out.println(opTwo);

        int opThree = 20 + -3 * 5 / 8;
        System.out.println(opThree);

        int opFour = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(opFour);


        /* 1.4 Write a Java program that takes two numbers as input from console and display the product of two numbers. */

        Scanner scanner = new Scanner(System.in); // This scanner is used for all upcoming tasks in this file)

        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        int prod = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + prod);


        /* 1.5 Write a Java program that takes a number as input and prints its multiplication table upto 10. */

        System.out.println("Input a number: ");
        int inpNum = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiply = i * inpNum;
            System.out.println(inpNum + " x " + i + " = " + multiply);
        }



        /* 1.6  print the area and perimeter of a circle. */

        double radius = 7.5;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is " + perimeter + "\n" + "Area is " + area);


        /* 1.7 Write a Java program to convert temperature from Fahrenheit to Celsius degree. */

        System.out.println("Input a degree in Fahrenheit: ");
        double degree = scanner.nextInt();

        double fahrToCels = (degree - 32) * 5 / 9;
        System.out.println(degree + " degree Fahrenheit is equal to " + fahrToCels + " in Celsius");


        /* 1.8 Write a Java program that reads a number in inches, converts it to meters. */


        System.out.println("Input a value for inch: ");
        double inch = scanner.nextInt();

        double meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter + " meters");


        /* 1.9 Write a Java program to get a number from the user and print whether it is positive or negative. */

        System.out.println("Input a number: ");
        int inputNum = scanner.nextInt();

        if (inputNum >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }


        /* 1.10 Take three numbers from the user and print the greatest number. */

        int a, b, c;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > c) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }


        /* 1.11  Write a program in Java to input 5 numbers from the keyboard and find their sum and average. */

        int sum = 0, inputNums;
        double avg;

        for (int i = 0; i < 5; i++) {

            inputNums = scanner.nextInt();
            System.out.println("Insert number");
            sum += inputNums;
        }
        avg = sum / 5;
        System.out.println("The sum of numbers is " + sum + "\nThe average is " + avg);


        /* 1.12   Write a program Check Whether Number is Even or Odd */

        System.out.println("Input a number");
        double evenOrOddNum = scanner.nextInt();

        if (evenOrOddNum % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

}

