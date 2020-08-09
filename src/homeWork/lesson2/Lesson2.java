package homeWork.lesson2;

import java.util.Arrays;

public class Lesson2 {


    public static void main(String[] args) {


        int[] arr1 = {1, 0, 1, 0, 1, 1, 0};
        System.out.println(Arrays.toString(inverseValues(arr1)));


        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(insertValues(arr2)));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplicationValues(arr3)));

        int[] arr4_1 = {34, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 100};
        System.out.println(searchMax(arr4_1));

        int[] arr4_2 = {34, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 100};
        System.out.println(searchMin(arr4_2));


        int size = 6;
        int[][] matrixPrint = matrix(size);

        for (int i = 0; i < matrixPrint.length; i++) {
            System.out.println(Arrays.toString(matrixPrint[i]));
        }


    }

    /**
     * 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     *
     * @param arr
     * @return
     */
    public static int[] inverseValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case (1):
                    arr[i] = 0;
                    break;

                case (0):
                    arr[i] = 1;
                    break;
            }

        }

        return arr;

    }


    /**
     * 2 Задать пустой целочисленный массив размером 8.
     * Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
     *
     * @param arr
     * @return
     */
    public static int[] insertValues(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                arr[i] = 1;  // на мой взгляд это кастыль, как сделать еще лучше ,пока не понятно
            } else {
                arr[i] = arr[i - 1] + 3;
            }

        }

        return arr;
    }

    /**
     * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
     * принимающий на вход массив и умножающий числа меньше 6 на 2;
     *
     * @param arr
     * @return
     */
    public static int[] multiplicationValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }

        return arr;

    }

    /**
     * 4 Задать одномерный массив.
     * Написать методы поиска в нём максимального элемента;
     *
     * @param arr
     * @return
     */

    public static int searchMax(int[] arr) {
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }

        }

        return maxElement;
    }

    /**
     * 4 Задать одномерный массив.
     * Написать методы поиска в нём минимального элемента;
     *
     * @param arr
     * @return
     */
    public static int searchMin(int[] arr) {
        int minElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minElement) {
                minElement = arr[i];
            }

        }

        return minElement;
    }

    /**
     * 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы);
     *
     * @param size
     * @return
     */

    public static int[][] matrix(int size) {

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {

            matrix[i][i] = 1;

            matrix[i][matrix.length - 1 - i] = 1;
        }

        return matrix;


    }


}


