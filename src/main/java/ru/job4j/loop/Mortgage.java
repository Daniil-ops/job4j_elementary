package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (salary > 0) {
            salary = (int) (salary + percent / 100 * salary - amount);
            if (salary <= 0) {
                break;
            } else {
                year++;
            }
        }
        return year;
    }
}
