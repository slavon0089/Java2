package ru.slava.java.core;

public interface Participants {

    default int canJump() {
        return 0;
    }

    default int canRun() {
        return 0;
    }

    default String hasName() {
        return String.valueOf(0);
    }

}
