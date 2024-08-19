package org.example;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 7);
        System.out.println("The sum of 5 and 7 is: " + result);
    }
}
