package com.company.Homework6_7;

public class CurrencyConverter {

    // region Dollar Converter
    public float convertDollarToEuro(float dollar) {
        return (float) (dollar * 0.9);
    }

    public float convertDollarToDram(float dollar) {
        return dollar * 484;
    }

    public float convertDollarToRuble(float dollar) {
        return dollar * 70;
    }
    //endregion

    // region Euro Converter
    public double convertEuroToDollar(float euro) {
        return euro * 1.11;
    }

    public float convertEuroToDram(float euro) {
        return euro * 538;
    }

    public float convertEuroToRuble(float euro) {
        return euro * 77;
    }
    //endregion

    // region Dram Converter
    public double convertDramToDollar(float dram) {
        return dram * 0.021;
    }

    public double convertDramToEuro(float dram) {
        return dram * 0.0019;
    }

    public double convertDramToRuble(float dram) {
        return dram * 0.15;
    }
    //endregion

    //region Ruble Converter
    public double convertRubleToDollar(float ruble) {
        return ruble * 0.014;
    }

    public double convertRubleToEuro(float ruble) {
        return ruble * 0.013;
    }

    public float convertRubleToDram(float ruble) {
        return (float) (ruble * 6.95);
    }
    //endregion

}
