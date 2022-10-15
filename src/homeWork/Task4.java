package homeWork;

import javax.swing.plaf.IconUIResource;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Task 1\n");

        for (int i = 10; i > 0; i--) {
            for (int j = 0; i > j; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 2\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 3\n");

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 9 - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
