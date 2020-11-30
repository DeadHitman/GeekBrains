package homeWork.Algoritm_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long currentTime2;
        long currentTime3;
        long currentTime4;
        int length = 1000000;


        /**
         * 1. Создать массив большого размера (миллион элементов).
         */
        int[] arr = new int[length];

        /**
         * 2. Заполнить массив случайными числами.
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        int[] arr2 = Arrays.copyOf(arr, length);
        int[] arr3 = Arrays.copyOf(arr, length);
        int[] arr4 = Arrays.copyOf(arr, length);

        currentTime2 = System.currentTimeMillis();
        arr2 = insertionSort(arr2);
        double deltaTime2 = (double) (System.currentTimeMillis() - currentTime2) / 1000;
        System.out.println("Время выполнения сортировки вставкой: " + deltaTime2 + " сек");

        currentTime3 = System.currentTimeMillis();
        arr3 = selectionSort(arr3);
        double deltaTime3 = (double) (System.currentTimeMillis() - currentTime3) / 1000;
        System.out.println("Время выполнения сортировки выборкой: " + deltaTime3 + " сек");

        currentTime4 = System.currentTimeMillis();
        arr4 = bubbleSort(arr4);
        double deltaTime4 = (double) (System.currentTimeMillis() - currentTime4) / 1000;
        System.out.println("Время выполнения пузырьковой сортировки: " + deltaTime4 + " сек");

        MyArrayList<String> arrayList = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(String.valueOf(i));
        }
        System.out.println(arrayList.toString());

    }


    /**
     * 3. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
     * @param a
     * @return
     */
    public static int[] selectionSort(int[] a) {
        int iMin;
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[iMin]) {
                    iMin = j;
                }
            }
            temp = a[i];
            a[i] = a[iMin];
            a[iMin] = temp;
        }
        return a;
    }

    public static int[] insertionSort(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            int j = i;
            temp = a[i];
            while (j > 0 && (temp < a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        boolean isSwap;
        int temp;
        for (int i = a.length - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                System.out.println("break " + i);
                break;
            }
        }
        return a;
    }
}

