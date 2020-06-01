package com.company.Homework6_5;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double celsiusToFahrenheit = temperatureConverter.convertCelsiusToFahrenheit(12);
        System.out.println(celsiusToFahrenheit);

        double fahrenheitToCelsius = temperatureConverter.convertFahrenheitToCelsius(12);
        System.out.println(fahrenheitToCelsius);

        double fahrenheitToKelvin = temperatureConverter.convertFahrenheitToKelvin(12);
        System.out.println(fahrenheitToKelvin);

        double celsiusToKelvin = temperatureConverter.convertCelsiusToKelvin(12);
        System.out.println(celsiusToKelvin);

        double kelvinToFahrenheit = temperatureConverter.convertKelvinToFahrenheit(12);
        System.out.println(kelvinToFahrenheit);

        double kelvinToCelsius = temperatureConverter.convertKelvinToCelsius(12);
        System.out.println(kelvinToCelsius);
    }
}
