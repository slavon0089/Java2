package ru.slava.java.core.hw4;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Phonebook {
    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        ArrayList<String> listNumbers = new ArrayList<>();

        if (phoneBook.containsKey(name)) {
            listNumbers = phoneBook.get(name);
            listNumbers.add(number);
            System.out.println(name +" " + number +" is added");
        } else {
            listNumbers.add(number);
            phoneBook.put(name, listNumbers);
            System.out.println(name +" " + number +"is added");
        }
    }

    public String get(String name) {
        System.out.println(phoneBook.get(name));
        return name;
    }

}
