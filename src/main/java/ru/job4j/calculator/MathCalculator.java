package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubtractAndDivide(double first, double second) {
        return subtraction(first, second)
                + divide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return subtraction(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета сложения суммы и произведения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета сложения разности и деления равен: " + sumSubtractAndDivide(10, 20));
        System.out.println("Результат расчета сложения всех операций равен: " + sumAllOperations(10, 20));
    }
}
