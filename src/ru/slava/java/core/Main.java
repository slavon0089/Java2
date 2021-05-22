package ru.slava.java.core;

public class Main {

    public static void changeArray (String array[]){

        String temp;
        for (int i = 0; i < array.length -1; i+=2) {
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
            }
    }

    public static void main(String[] args) {

        String [] array = new String[]{"a ","b ","c ","d ","e ","f "};

        changeArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]);
        }
        System.out.println();


        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple, apple, apple, apple,apple,apple);
        Box<Orange> box2 = new Box<Orange>(orange, orange,orange, orange);

        box1.compare(box2);

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
        }
}