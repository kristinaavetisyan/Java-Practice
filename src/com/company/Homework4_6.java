package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4_6 {

    public static void main(String[] args) {

        // Task 6

        int[][] matrix = new int[10][15];
        initializeMatrix(matrix);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of a row");
        int rowNumber = scanner.nextInt();
        sumOfInsertedRowNumbers(matrix, rowNumber);

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

    public static void sumOfInsertedRowNumbers(int[][] matrix, int rowNumber) {
        int sumOfRowNumbers = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sumOfRowNumbers += matrix[rowNumber][i];
        }
        System.out.println(sumOfRowNumbers);
    }


}
