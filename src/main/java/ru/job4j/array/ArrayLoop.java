package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 3 + 2;
        }
        for (int index : numbers) {
            System.out.println(index);
        }
    }
}
