package org.example;

public class Main {
    public static void main(String[] args) {

        Laser laser = new Laser();
        StrongRight strongRight = new StrongRight();
        RayGun rayGun = new RayGun();

        Robot robot_one = new Robot("Gir", laser);
        Robot robot_two = new Robot("Franky", strongRight);
        Robot robot_three = new Robot("ED-E", rayGun);


        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();

    }

}