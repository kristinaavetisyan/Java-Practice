package com.company;

import java.util.Random;

public class Homework4_3 {
    public static void main(String[] args) {

        // Task 3

        int[] initialArray = new int[10];
        initializeArray(initialArray);
        sortArrayInDescOrder(initialArray);
    }

    public static void initializeArray(int[] initialArray) {
        Random random = new Random();
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = random.nextInt(89) + 10;
            System.out.print(initialArray[i]);
            System.out.print(", ");
        }
    }

    public static void sortArrayInDescOrder(int[] initialArray) {
        int initialNumber;
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = i + 1; j < initialArray.length; j++) {
                if (initialArray[i] < initialArray[j]) {
                    initialNumber = initialArray[i];
                    initialArray[i] = initialArray[j];
                    initialArray[j] = initialNumber;
                }
            }
            System.out.print("\n" + initialArray[i]);
            System.out.print(", ");
        }

    }
}
