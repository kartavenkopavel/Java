package task2;

public class HomeWork {

    public static void main(String[] args) {
        int taskNumber = 1;
        System.out.println("Task " + taskNumber++);
        int a = 42;
        int b = 311;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println(" a > b");
        }

        System.out.println("Task " + taskNumber++);

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        System.out.println("Task " + taskNumber++);

        int num = 9121;

        if (num > 10) {
            System.out.println("больше 10");

        } else if (num < 100) {
            System.out.println("меньше 100");
        }
        if ((num / 2) > 20) System.out.println("результат деления на 2 больше 20");

        if (num >= 5 && num <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        System.out.println("Task " + taskNumber++);

        for (int i = 0; i <= 15; i++) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("Task " + taskNumber++);
        int number = 5;
        int power = 1;
        int result = number;

        while (result <= 10000) {
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
            result = number * result;
        }

        System.out.println();

        for (int i = 5; i < 10000; i *= 5) {
            System.out.println(i);
        }

        System.out.println("Task " + taskNumber++);

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();

        for (int i = 40; i <= 60; i += 4) {
            System.out.print(i + ",");
        }
        System.out.println();






    }
}
