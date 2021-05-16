package ru.slava.java.core;

public class Human implements Participants {

    public int run = 2500;
    public int jump = 2;
    public String name = "John";

    @Override
    public int canJump() {
        return jump;
    }

    @Override
    public int canRun() {
        return run;
    }

    @Override
    public String hasName() {
        return name;
    }
}
