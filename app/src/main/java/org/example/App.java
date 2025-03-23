package org.example;

public class App {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java App <num1> <num2> <operation>");
            System.out.println("Operation: add, subtract, multiply, divide");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String operation = args[2].toLowerCase();
            double result = calculate(num1, num2, operation);  // Call the new method
            if (Double.isNaN(result)) {
                System.out.println("Error: Division by zero or invalid operation!");
            } else {
                System.out.println(num1 + " " + getOperatorSymbol(operation) + " " + num2 + " = " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers!");
        }
    }

    // New method for testing
    public static double calculate(double num1, double num2, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 == 0) return Double.NaN;  // Return NaN for division by zero
                return num1 / num2;
            default:
                return Double.NaN;  // Return NaN for invalid operation
        }
    }

    // Helper method for nicer output
    private static String getOperatorSymbol(String operation) {
        switch (operation.toLowerCase()) {
            case "add": return "+";
            case "subtract": return "-";
            case "multiply": return "*";
            case "divide": return "/";
            default: return "";
        }
    }
}