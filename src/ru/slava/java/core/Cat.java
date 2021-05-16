package ru.slava.java.core;

public class Cat implements Participants {

    public int run = 200;
    public int jump = 1;
    public String name = "Murka";

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
