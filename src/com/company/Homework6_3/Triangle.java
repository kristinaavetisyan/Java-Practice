package com.company.Homework6_3;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        double perimeter = this.sideA + this.sideB + this.sideC;
        return perimeter;
    }

    public double calculateArea() {
        double perimeter = this.sideA + this.sideB + this.sideC;
        double area = Math.sqrt(perimeter * ((perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
        return area;
    }
}
