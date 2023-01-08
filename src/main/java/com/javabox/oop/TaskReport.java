package com.javabox.oop;

/***
 * Dependency injection
 * -- constructor injection:
 * -- setter injection: change the dependency  of a class through the app's lifetime
 * -- method injection: pass dependency to the method that needs that dependency
 * -- interface segregation principle
 */
public class TaskReport {

    private TaskCalculator calculator;

    // construction injection in action
//    public TaskReport(TaskCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show( TaskCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    public void setCalculator(TaskCalculator calculator) {
        this.calculator = calculator;
    }
}
