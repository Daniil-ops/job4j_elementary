package ru.job4j.condition;

public class Cinema {
    public static void acess(int age) {
        System.out.println("The age of the customer is: " + age);
        if (age >= 21) {
            System.out.println("Welcome to the Cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.acess(21);
        Cinema.acess(16);
    }
}
