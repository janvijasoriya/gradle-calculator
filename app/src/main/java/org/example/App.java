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

            double result;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "subtract":
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "multiply":
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case "divide":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Use: add, subtract, multiply, divide");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers!");
        }
    }
}