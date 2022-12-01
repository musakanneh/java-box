package com.javabox.mortgageCalculator;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principle: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        double mortgage = MortgageCalculator.calculateMortgage(principal, annualInterest, years);

        MortgageReport.printMortgage(mortgage);
        MortgageReport.printPaymentSchedule(principal, annualInterest, years);
    }
}