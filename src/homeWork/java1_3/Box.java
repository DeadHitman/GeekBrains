package homeWork.java1_3;

import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit>  {

    private ArrayList<T> box = new ArrayList();


    public float getWeight() {

        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWheight();
        }
        return weight;


    }


    /**
     * 3. Большая задача:
     * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
     * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
     * g. Не забываем про метод добавления фрукта в коробку.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        Box<T> box1 = (Box<T>) o;
        if (this == o || (this.getWeight() == box1.getWeight()) ) return true;
        if (o == null ) return false;




        return box.equals(box1.box);
    }


    public void relocate(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }


    public static void main(String[] args) {


    }


}