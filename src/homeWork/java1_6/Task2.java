package homeWork.java1_6;

/*
Написать метод, который проверяет что массив состоит только из чисел
 1 и 4. Если в массиве нет хоть одной 4 или 1, то метод вернет false;
Написать набор тестов для этого метода (варианта 3-4 входных данных)
 */
public class Task2 {
    public static boolean Only1And4(int[] arr) {
        boolean i1 = false, i4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) i1 = true;
            else if (arr[i] == 4) i4 = true;
            else return false;
        }
        return i1 && i4;
    }
}
