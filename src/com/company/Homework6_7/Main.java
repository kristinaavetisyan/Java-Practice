package com.company.Homework6_7;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter currencyConverter = new CurrencyConverter();

        float dollarToEuro = currencyConverter.convertDollarToEuro(23);
        System.out.println(dollarToEuro);

        float dollarToDram = currencyConverter.convertDollarToDram(24);
        System.out.println(dollarToDram);

        float dollarToRuble = currencyConverter.convertDollarToRuble(25);
        System.out.println(dollarToRuble);

        double euroToDollar = currencyConverter.convertEuroToDollar(30);
        System.out.println(euroToDollar);

        float euroToDram = currencyConverter.convertEuroToDram(45);
        System.out.println(euroToDram);

        float euroToRuble = currencyConverter.convertEuroToRuble(32);
        System.out.println(euroToRuble);

        double dramToDollar = currencyConverter.convertDramToDollar(34);
        System.out.println(dramToDollar);

        double dramToEuro = currencyConverter.convertDramToEuro(54);
        System.out.println(dramToEuro);

        double dramToRuble = currencyConverter.convertDramToRuble(98);
        System.out.println(dramToRuble);

        float rubleToDollar = (float) currencyConverter.convertRubleToDollar(77);
        System.out.println(rubleToDollar);

        double rubleToEuro = currencyConverter.convertRubleToEuro(45);
        System.out.println(rubleToEuro);

        float rubleToDram = currencyConverter.convertRubleToDram(56);
        System.out.println(rubleToDram);

    }
}
