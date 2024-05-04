package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, second, third));
    }

    public static void main(String[] args) {
        int result = max(1, 2);
        System.out.println(result);
    }
}
