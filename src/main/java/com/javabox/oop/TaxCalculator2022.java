package com.javabox.oop;

public class TaxCalculator2022 implements TaskCalculator {

    private double taxableIncome;

    public TaxCalculator2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
