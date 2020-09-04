package homeWork.java1_2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {

    private HashMap<String, ArrayList<String>> hashMap = new HashMap<>();


    public void add(String lastname, ArrayList<String> phoneNumber) {
        hashMap.put(lastname, phoneNumber);
    }

    public void get(String lastname) {

        if (hashMap.containsKey(lastname)) {
            ArrayList<String> phones = hashMap.get(lastname);

            System.out.println("По фамилии " + lastname + " следующий список номеров : " + phones.toString());
        } else {
            System.out.println("Фамилии - " + lastname + " нет в справочнике");
        }

    }


}

