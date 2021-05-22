package ru.slava.java.core;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> elements;

    public Box(T... elements) {
        this.elements = new ArrayList<T>(Arrays.asList(elements));
    }

    public void add(T... elements) {
        this.elements.addAll(Arrays.asList(elements));
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(elements);
    }

    public void clear() {
        elements.clear();
    }

    public float getWeight() {
        float weight = 0;
        for (T element: elements) {
            weight += element.getWeight();
        }
        System.out.println(weight);
        return weight;
    }

    public void compare(Box box) {

            if (this.getWeight() == box.getWeight())
                System.out.println("Size of boxes is the same");
            else
                System.out.println("Boxes has different sizes");
       // return true;
    }

    public void transfer(Box<? super T> box) {
        box.elements.addAll(this.elements);
        System.out.println("All fruits is moved ");
        clear();
    }
}