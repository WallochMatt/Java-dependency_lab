package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon laser = new Laser();
        Weapon strongRight = new StrongRight();
        Weapon rayGun = new RayGun();

        Attacker robot_one = new Robot("Gir", laser);
        Attacker robot_two = new Robot("Franky", strongRight);
        Attacker robot_three = new Robot("ED-E", rayGun);

        Attacker dino_one = new Dinosaur("Gawr", 80);


        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
        dino_one.Attack();
    }

}