package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent /= 100;
        double debt = amount + amount * percent;
            while (debt > 0) {
                year++;
                debt = ((debt - salary) * percent) + debt - salary;
            }
        return year;
    }
}
