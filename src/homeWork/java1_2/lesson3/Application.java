package homeWork.java1_2.lesson3;

import java.util.*;

public class Application {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Мама");
        words.add("Папа");
        words.add("Бабушка");
        words.add("Дедушка");
        words.add("Кот");
        words.add("Кот");
        words.add("Енот");
        words.add("Папа");
        words.add("ПраБабушка");
        words.add("Кот");
        words.add("Мама");

        HashSet<String> set = getUniqueWords(words);

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println((i.next()));
        }


        HashMap<String, Integer> hashMap = getCountWords(words);

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Слово - " + entry.getKey() + " ; Кол-во вхождений - " + entry.getValue());
        }

        ArrayList<String> phonesIvanov = new ArrayList<>();
        phonesIvanov.add("+7 905-551-21-12");
        phonesIvanov.add("+7 910-603-21-56");
        phonesIvanov.add("+7 812-551-65-12");
        phonesIvanov.add("+7 905-387-21-90");

        ArrayList<String> phonesPetrov = new ArrayList<>();
        phonesPetrov.add("7-021-45-32");


        AddressBook addressBook = new AddressBook();
        addressBook.add("Иванов",phonesIvanov);
        addressBook.add("Петров",phonesPetrov);


        addressBook.get("Иванов");

    }

    /**1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * @param arrayList
     * @return
     */
    public static HashSet<String> getUniqueWords(ArrayList<String> arrayList) {

        HashSet<String> uniqueWords = new HashSet<>();

        uniqueWords.addAll(arrayList);

        return uniqueWords;
    }

    /**
     * Посчитать сколько раз встречается каждое слово.
     * @param arrayList
     * @return
     */
    public static HashMap<String, Integer> getCountWords(ArrayList<String> arrayList) {

        HashMap<String, Integer> countWords = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String temp = arrayList.get(i);
            int count = 0;

            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    count++;
                    //map создать уникальные слова и в значение их кол-во
                    countWords.put(temp, count);

                }

            }
        }

        return countWords;
    }

}
