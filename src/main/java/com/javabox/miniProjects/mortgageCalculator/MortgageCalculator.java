package com.javabox.miniProjects.mortgageCalculator;

public class MortgageCalculator {
    //  static fields
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    // encapsulation in action (instance fields)
    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentMade) {
        // abstraction in action
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        return balance;
    }

    public double calculateMortgage() {
        // abstraction in action
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }

        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }
}