package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {

        // Task 1

        Random randomNumbers = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers.nextInt(89) + 10;
            System.out.print(array[i]);
            System.out.print(", ");
        }

        System.out.println("\nPlease insert a number: ");
        int insertedNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (insertedNumber == array[i]) {
                System.out.println("Array contains that number");
            }
        }
    }
}

