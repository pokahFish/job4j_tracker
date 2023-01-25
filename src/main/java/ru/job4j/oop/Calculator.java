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
        int rsl1 = sum(5);
        System.out.println(rsl1);
        int rsl2 = minus(5);
        System.out.println(rsl2);
        Calculator calculator = new Calculator();
        int rsl3 = calculator.multiply(5);
        System.out.println(rsl3);
        int rsl4 = calculator.divide(5);
        System.out.println(rsl4);
        int rsl5 = calculator.sumAllOperation(5);
        System.out.println(rsl5);
    }

}
