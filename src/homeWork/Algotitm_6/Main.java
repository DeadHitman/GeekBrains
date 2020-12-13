package homeWork.Algotitm_6;

import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,"four");
//        map.put(2,"two two");
//
////        System.out.println(map);
////        System.out.println(map.get(2));
//
////        map.deleteMin();
//        System.out.println(map);
//        System.out.println(map.size());
//
//        map.delete(5);
//        System.out.println(map);
//        System.out.println(map.size());


        Random random = new Random();
        int countTree = 1000;
        int balCount = 0;

        for (int i = 0; i < countTree; i++) {
            MyTreeMap1<Integer, Integer> map = new MyTreeMap1<>();
            int x = 0;
            while (map.height() < 6) {
                x = random.nextInt(201) - 100;
                map.put(x, x);
            }
            map.delete(x);
            if (map.isBalance()) {
                balCount++;
            }
        }
        System.out.println("balCount " + balCount + " countTree " + countTree);
        System.out.println("balanced " + (double) balCount / countTree * 100 + " %");
        System.out.println("no balanced " + (double) (countTree - balCount) / countTree * 100 + " %");


    }
}
