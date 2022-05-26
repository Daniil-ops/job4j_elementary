import java.util.Scanner;

public class BattleShip {
    static String playerName1 = "Daniil";
    static String playerName2 = "Igor";
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];

    public static void main(String[] args) {
//        System.out.println("Player#1, please enter your name:");
//        playerName1 = scanner.nextLine();
//        System.out.println("Player#2, please enter your name:");
//        playerName2 = scanner.nextLine();
    }

    public static void drawField() {
        System.out.println();
        System.out.println(playerName1 + ",please place your ships on the battlefield:");
        System.out.println();
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                System.out.print(" _");
            }
            System.out.println();
        }
        System.out.println("please enter OX coordinate:");
        int x = scanner.nextInt();
        System.out.println("please enter OY coordinate:");
        int y = scanner.nextInt();
        System.out.println("Choose direction:");
        System.out.println("1. Vertical.");
        System.out.println("2. Horizontal.");
        int rotation = scanner.nextInt();
        int direction = scanner.nextInt();
        battlefield1[x][y] = 1;
        if (direction == 1) {
            battlefield1[x][y + 1] = 1;
            battlefield1[x][y + 2] = 1;
            battlefield1[x][y + 3] = 1;
        } else {
            battlefield1[x + 1][y] = 1;
            battlefield1[x + 2][y] = 1;
            battlefield1[x + 3][y] = 1;
        }
    }
}