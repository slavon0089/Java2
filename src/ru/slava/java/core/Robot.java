package ru.slava.java.core;

public class Robot implements Participants {

    public int run = 10000;
    public int jump = 5;
    public String name = "R2D2";


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