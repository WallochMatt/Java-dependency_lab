package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon club = new Weapon("Club", 25);

        Robot robot_one = new Robot(new Weapon("Self Destruct", 50));
        Robot robot_two = new Robot(club);

        System.out.println(robot_one.name);
        robot_one.Attack();
        robot_two.Attack();
    }
}