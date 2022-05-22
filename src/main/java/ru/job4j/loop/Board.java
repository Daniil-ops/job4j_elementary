package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                System.out.print(cell % 2 == 0 ? 'X' : ' ');
            }
            if (row % 2 == 0) {
                System.out.println();
                width--;
                System.out.print(" ");
            } else {
                width++;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}