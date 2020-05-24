package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4_4 {
    public static void main(String[] args) {

        // Task 4

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        initializeArray(array);

        System.out.println("Please insert a number");
        int insertedNumber = scanner.nextInt();

        findIndexOfNumber(array, insertedNumber);
    }

    public static void initializeArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
            System.out.println(array[i]);
        }
    }

    public static void findIndexOfNumber (int[] array, int insertedNumber ){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == insertedNumber){
                System.out.println(i);
            }
        }
    }
}
