package com.company.Homework6_1;

public class Circle {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
    }
}
