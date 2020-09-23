package homeWork.java1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

    /**
     * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     * @param array
     * @param index1
     * @param index2
     */
    public static void switchElements(Object[] array, int index1, int index2){

        Object temp;
        for (int i = 0; i < array.length; i++) {
            temp =array[index1];
            array[index1] = array[index2];
            array[index2]=temp;
        }

    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     * @param array
     * @param <T>
     */
    public static <T> void asList(T[]array){

        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        Integer a[] = {1,2,3,4,5};

        Application.switchElements(a,0,1);
        System.out.println(Arrays.toString(a));

        Application.asList(a);
        System.out.println("Преобразование в ArrayList " + a);

// 3 задание
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(),2);


        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(),3);
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.equals(orangeBox));


    }
}
