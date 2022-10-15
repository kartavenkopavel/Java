package task3;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("task 1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        System.out.println(sumArray);

        System.out.println("task 2");

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > maxValue) {
                maxValue = array1[i];
            }
        }
        System.out.println(maxValue);

        System.out.println("task 3");

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = array2[0];

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < minValue) {
                minValue = array2[i];
            }
        }
        System.out.println(minValue);

        System.out.println("task 4");

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                sum += array4[i][j];
                count++;

            }
        }
        System.out.println(sum / count);

        System.out.println("task 5");

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxValueArray = array5[0][0];

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (array5[i][j] > maxValueArray) {
                    maxValueArray = array5[i][j];
                }
            }
        }
        System.out.println(maxValueArray);

        System.out.println("task 6");

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxValue2 = array6[0][0];

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (maxValue2 < array6[i][j]) {
                    maxValue2 = array6[i][j];
                }
            }

        }
        System.out.println(maxValue2);

        System.out.println("task 7");

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int countArray7 = 0;

        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                countArray7++;

            }
        }
        System.out.println(countArray7);


        System.out.println("task round");

        int height = 4;

        for (int j = 0; j <= height ; j++) {
            for (int i = height; i > j ; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        int r = 10;

        for (int y = 0; y <= 2 * r; y += 2) {
            // Длина шага y равна 2, и изменение длины шага y может превратить круг в эллипс.
            Integer x = (int) Math.round(r - Math.sqrt(2 * r * y - y * y));
            Integer len = 2 * (r - x); //// Расстояние между двумя симметричными

            for (int i = 0; i <= x; i++) {  // расстояние слева от консоли
                System.out.print(" ");
            }
            System.out.print(" * ");

            for (int j = 0; j <= len; j++) {
                System.out.print(" ");
            }
            System.out.println(" * ");
        }






    }
}
