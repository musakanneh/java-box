package com.javabox.oop;

public class Main {
    /***
     * Lookup:
     * 1. constructor and inheritance
     * 2. assess modifiers
     * 3. upcasting => casting an object to one of its super types
     * 4. down-casting => casting an obj to of its subtypes
     * 5. method overriding
     * 6. abstract classes and methods
     */
    public static void main(String[] args) {
        var textBox = new TextBox();
        show(textBox);

        // polymorphism in action
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control :  controls) {
            control.render();
        }

        // interface in action
        System.out.println("\nTask Calculator");
        var calculator = new TaxCalculator2022(100_000);
        var report = new TaskReport();
        report.show(calculator);

//        System.out.println("dep eng");
//        report.setCalculator(new TaxCalculator2019());
//        report.show();
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("Hello text");
        }
        System.out.println(control);
    }
}
