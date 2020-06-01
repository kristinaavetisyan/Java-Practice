package com.company.Homework6_2;

public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea() {
        double area = this.height * this.width;
        System.out.println(area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (this.height + this.width);
        System.out.println(perimeter);
    }
}
