package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent /= 100;
            while (amount + amount * percent > 0) {
                year++;
                amount = ((amount + amount * percent - salary) * percent) + amount + amount * percent - salary;
                System.out.println(amount);
            }
        return year;
    }
}
