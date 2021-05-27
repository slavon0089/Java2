package ru.slava.java.core.hw4;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int worldsCount = 15;
        String worlds [] = new String[worldsCount];

        for (int i = 0; i <worldsCount; i++) {
            worlds[i] = "apple"+((int)(Math.random() * 5) + 5);
            System.out.println(worlds[i]);
        }
        Set<String> unique = new HashSet<>(Arrays.asList(worlds));
        System.out.println("unique words" + unique);

        Map<String, Integer> repeat = new HashMap<>();
        for (String world : worlds) {
            if (repeat.containsKey(world)) {
                repeat.put(world, repeat.get(world) + 1);
            } else {
                repeat.put(world, 1);
            }
        }
        System.out.println("repeats: " + repeat);
        System.out.println();


    Phonebook phonebook = new Phonebook();

        phonebook.add("Sasha", "+375298151201");
        phonebook.add("Katya", "+375298351201");
        phonebook.add("Dasha", "+375398451201");
        phonebook.add("Maxim", "+374298451201");
        phonebook.add("Jenia", "+375294451201");
        phonebook.add("Sasha", "+375298452301");
        phonebook.add("Katya", "+375293331201");
        phonebook.add("Pasha", "+375298451201");
        phonebook.add("Dasha", "+371118451201");

        System.out.println(phonebook.get("Dasha"));
        System.out.println(phonebook.get("Sasha"));
        System.out.println(phonebook.get("Katya"));
}
}