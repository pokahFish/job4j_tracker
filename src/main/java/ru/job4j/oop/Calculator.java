package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + divide(y) + minus(y);
    }

    public static void main(String[] args) {
        sum(5);
        minus(5);
        Calculator calculator = new Calculator();
        calculator.multiply(5);
        calculator.divide(5);
        calculator.sumAllOperation(5);
    }

}
