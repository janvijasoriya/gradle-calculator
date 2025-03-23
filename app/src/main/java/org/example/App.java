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
            double result = calculate(num1, num2, operation);  // Use the new method
            if (Double.isNaN(result)) {
                if (num2 == 0 && operation.equals("divide")) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.println("Invalid operation! Use: add, subtract, multiply, divide");
                }
            } else {
                System.out.println(num1 + " " + getOperatorSymbol(operation) + " " + num2 + " = " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers!");
        }
    }

    public static double calculate(double num1, double num2, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 == 0) return Double.NaN;  // Division by zero
                return num1 / num2;
            default:
                return Double.NaN;  // Invalid operation
        }
    }

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