package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        /* 2.1 Generate 2 random int numbers in range 10 - 100. Calculate the sum. Cast it to long. */

        Random random = new Random();

        int numOne = random.nextInt(90) + 10;
        int numTwo = random.nextInt(90) + 10;

        int sum = numOne + numTwo;
        long castedSum = (long) sum;

        System.out.println(castedSum);

        /* 2.2 Generate 2 random int numbers in range 10 - 100. Calculate the product. In case product is even cast it to long, in case product is odd cast it to double
            Print the product */

        int numThree = random.nextInt(90) + 10;
        int numFour = random.nextInt(90) + 10;

        int prod = numThree * numFour;

        if (prod % 2 == 0) {
            long castedProd = (long) prod;
            System.out.println(castedProd + " is even number");
        }
        if (prod % 2 != 0) {
            double castedProd = (double) prod;
            System.out.println(castedProd + " is odd number");
        }

        /* 2.3 Generate a random int number in range 10 - 100, calculate the square of it. (Math.pow()), cast the result to String,  (String.valueOf())
            print the result */

        int numFive = random.nextInt(90) + 10;
        int square = (int) Math.pow(numFive, 2);

        String castedInt = String.valueOf(square);

        System.out.println(castedInt);

        /* 2.4 Get from the user an int number (from console) in case number > 100  Generate a random int in range 50 - number : in case number < 100 Generate a random int in range 0 - 50:
            cast the random number to String print */

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 100) {
            int randNum = random.nextInt(50) + (number - 50);
            String castedNum = String.valueOf(randNum);
            System.out.println(castedNum);
        }
        if (number < 100) {
            int randNum = random.nextInt(50);
            String castedNum = String.valueOf(randNum);
            System.out.println(castedNum);
        }


        /* 2.5 Generate 2 random ints. Take from console an operator (+, -, * or /). Perform calculation based on operator (USING SWITCH)
            print the result */


        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        System.out.println("Insert an operator: +, -, * or / ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Oops, something is wrong!");
        }


        /* 2.6 Write a program to input week number(1-7) from console and print day of week name  (1 - monday …7 - sunday) using switch case. */

        System.out.println("Enter a number from 1 up to 7: ");
        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("Yaaay it's  Friday :) ");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Such day of week doesn't exist");
        }

        /* 2.7 Write  Program to print number of days in month using switch...case. Input “monthName” from console (you can get string from console by  scanner.nextLine() )*/

        System.out.println("Enter a month: ");
        String monthName = scan.nextLine();
        monthName.toLowerCase();

        switch (monthName) {
            case "december":
                System.out.println("December has 31 days");
                break;
            case "january":
                System.out.println("January has 31 days");
                break;
            case "february":
                System.out.println("February has 28 or 29 days");
                break;
            case "march":
                System.out.println("March has 31 days");
                break;
            case "april":
                System.out.println("April has 30 days");
                break;
            case "may":
                System.out.println("May has 31 days");
                break;
            case "june":
                System.out.println("June has 30 days");
                break;
            case "july":
                System.out.println("July has 31 days");
                break;
            case "august":
                System.out.println("August has 31 days");
                break;
            case "September":
                System.out.println("September has 30 days");
                break;
            case "october":
                System.out.println("October has 31 days");
                break;
            case "november":
                System.out.println("November has 30 days");
                break;
            default:
                System.out.println("That's not a valid month");

                // this was very painful
        }

        /* 2.8 */

        System.out.println("------------MENU-----------");
        System.out.println("---> enter 1 for calculating area of the circle");
        System.out.println("---> enter 2 for calculating perimeter of the circle");
        System.out.println("---> enter 3 for exit");
        double circleNum = scan.nextInt();

        int radius = 5;

        while (circleNum != 3) {
            if (circleNum == 1) {
                double area = Math.PI * radius * radius;
                System.out.println("Area of circle is " + area);
            } else if (circleNum == 2) {
                double perimeter = 2 * Math.PI * radius;
                System.out.println("Perimiter of circle is " + perimeter);
            }

            System.out.println("------------MENU-----------");
            System.out.println("---> enter 1 for calculating area of the circle");
            System.out.println("---> enter 2 for calculating perimeter of the circle");
            System.out.println("---> enter 3 for exit");
            circleNum = scan.nextInt();

        }
    }
}
