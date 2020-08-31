package homeWork.java1_2.lesson2;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {

        String s = "10 3 1 2\n2 1 2 2\n5 6 7 1\n300 3 1 0";

        try {
            System.out.println(Arrays.deepToString(parseStringToArray(s)));

            System.out.println(result(parseStringToArray(s)));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }


    /**
     * 1 Есть строка вида: "10 3 1 2\n2 3 1 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
     * Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
     *
     * @param s
     * @return
     */
    public static String[][] parseStringToArray(String s) throws MyArraySizeException {

        String arrSplitn[] = s.split("\n");
        for (int i = 0; i < arrSplitn.length; i++) {

            if (arrSplitn[i].split("\\s").length != 4) {

                throw new MyArraySizeException("Кол-во строк в матрице не равно 4x4, проблемная строка " + arrSplitn[i]);
            }

        }


        String arrAll[][] = new String[4][4];


        for (int i = 0; i < arrAll.length; i++) {
            arrAll[i] = arrSplitn[i].split("\\s");

            for (int j = 0; j < arrAll[i].length; j++) {
            }

        }

        return arrAll;

    }


    /**
     * 2. Преобразовать все элементы массива в числа типа int,
     * просуммировать, поделить полученную сумму на 2, и вернуть результат;
     *
     * @param s
     * @return
     */
    public static float result(String[][] s) throws NumberFormatException {

        int sum = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {

                try {
                    sum += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В элементе [" + i + "," + j + "] находится не число : " + e.getMessage() );
                }
            }

        }

        return sum / 2;
    }
}
