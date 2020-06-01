package com.company.Homework6_3;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setSideA(10);
        triangle.setSideB(12);
        triangle.setSideC(13);

        triangle.calculateArea();
        triangle.calculatePerimeter();

    }
}
