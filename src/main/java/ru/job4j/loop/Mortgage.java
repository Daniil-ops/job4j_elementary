package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = -1;
        double i = salary;
        while (i >= 0) {
            i = i + percent / 100 * i - amount;
            year++;
        }
        return year;
    }
}