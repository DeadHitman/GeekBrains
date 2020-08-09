package homeWork.leson1;

public class Lesson1 {

    public static void main(String[] args) {


        double result = Lesson1.expression(3, 4, 5, 6);
        System.out.println(result);

        System.out.println(compareValues(15, 5));

        String values = Lesson1.compareValues(-1);
        System.out.println(values);

        String name = Lesson1.returnHello("Джон");
        System.out.println(name);

        String year = Lesson1.isLeapYear(2013);
        System.out.println(year);


    }


    /**
     * 1 задание  Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
     * где a, b, c, d – целочисленные входные параметры этого метода;
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static double expression(int a, int b, int c, int d) {

        double result = a * (b + ((double) c / d)); //деление  целых числех, кладется в double


        return result;
    }


    /**
     * 2 задание Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     * если да – вернуть true, в противном случае – false;
     *
     * @param x
     * @param y
     * @return
     */
    public static boolean compareValues(int x, int y) {
        int sum = x + y;
        boolean isIn = sum >= 10 && sum <= 20;
        if (isIn) {

            return isIn;

        } else {

            return isIn;

        }

    }

    /**
     * 3 задание Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное.
     * Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     *
     * @param x
     */
    public static String compareValues(int x) {


        if (x >= 0) {
            return "Положительное число";
        } else {
            return "Отрицательное число";

        }

    }

    /**
     * 4 задание Написать метод, которому в качестве параметра передается строка,
     * обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
     *
     * @param name
     */
    public static String returnHello(String name) {

        return "Привет, " + name + "!";
    }

    /**
     * 5 Задание Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     * Для проверки работы вывести результаты работы метода в консоль
     *
     * @param year
     * @return
     */
    public static String isLeapYear(int year) {

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {

            return "Високосный Год = " + year;
        } else {
            return "Не Високосный Год = " + year;

        }


    }


}
