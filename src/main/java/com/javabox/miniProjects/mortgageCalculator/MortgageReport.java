package com.javabox.miniProjects.mortgageCalculator;
import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(currencyInstance.format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println("\nMORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payments $: " + mortgageFormatted);
    }
}