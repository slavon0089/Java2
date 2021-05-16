package ru.slava.java.core;

public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();

        Participants[] participants = {new Human(),new Robot(), new Cat()};

            wall.height = 2;
            treadmill.distance = 1000;

        for (int i = 0; i < 3; i++) {
                if (participants[i].canRun() > treadmill.distance){
                System.out.println(participants[i].hasName() + " пробежал " +treadmill.distance + "м, " +
                        "а может пробежать " +participants[i].canRun() +"м");
            }
                else {
                    System.out.println(participants[i].hasName() + " не может пробежать " +treadmill.distance + "м, " +
                            "его максимум " +participants[i].canRun()+"м" );
                }

            if (participants[i].canJump() >= wall.height){
                System.out.println(participants[i].hasName() + " перепрыгнул стену " +wall.height + "м, " +
                        "а может перепрыгнуть " +participants[i].canJump() +"м");
            }
            else {
                System.out.println(participants[i].hasName() + " не перепрыгнул стену " +wall.height + "м, " +
                        "он может перепрыгнуть только " +participants[i].canJump() +"м");
            }
        }
    }
}
