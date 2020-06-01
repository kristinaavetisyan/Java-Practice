package com.company.Homework6_5;

public class TemperatureConverter {

    public double convertFahrenheitToCelsius(double degree) {
        double celsius = (degree - 32) * 5 / 9;
        return celsius;
    }

    public double convertFahrenheitToKelvin(double degree) {
        double kelvin = (5 / 9 * (degree - 32) + 273.15);
        return kelvin;
    }

    public double convertCelsiusToFahrenheit(double degree) {
        double fahrenheit = (degree + 32) * 9 / 5;
        return fahrenheit;
    }

    public double convertCelsiusToKelvin(double degree) {
        double kelvin = degree + 273.15;
        return kelvin;
    }

    public double convertKelvinToFahrenheit(double degree) {
        double fahrenheit = 9 / 5 * (degree - 273.15) + 32;
        return fahrenheit;
    }

    public double convertKelvinToCelsius(double degree) {
        double celsius = degree - 273.15;
        return celsius;
    }
}
