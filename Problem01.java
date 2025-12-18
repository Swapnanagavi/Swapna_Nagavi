package com.java;
import java.util.Scanner;

class Problem01 {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide":
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem01 p = new Problem01();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Operation: ");
        String op = sc.next();

        System.out.println("Result: " + p.calculate(a, b, op));
        sc.close();
    }
}


