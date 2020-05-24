package com.company;

import java.util.Random;

public class Homework4_5 {

    public static void main(String[] args) {

        //Task 5

        int[][] matrix = new int[10][15];
        initializeMatrix(matrix);

        findMaximumNumberOfMatrix(matrix);

    }

    public static void initializeMatrix(int[][] matrixToInt) {
        Random random = new Random();
        for (int i = 0; i < matrixToInt.length; i++) {
            for (int j = 0; j < matrixToInt[i].length; j++) {
                matrixToInt[i][j] = random.nextInt(89) + 10;
                System.out.print(matrixToInt[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void findMaximumNumberOfMatrix (int[][] matrixMax){
        int maximum = 0;
        for (int i = 0; i < matrixMax.length; i++) {
            for (int j = 0; j < matrixMax.length; j++) {
                if(matrixMax[i][j] > maximum){
                    maximum = matrixMax[i][j];
                }
            }
        }
        System.out.println(maximum);
    }
}
