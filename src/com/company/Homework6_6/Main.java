package com.company.Homework6_6;

public class Main {
    public static void main(String[] args) {

        DistanceConverter distanceConverter = new DistanceConverter();

        double meters = distanceConverter.convertMetersToMiles(34);
        System.out.println(meters);

        double miles = distanceConverter.convertMilesToMeters(23);
        System.out.println(miles);

    }
}
