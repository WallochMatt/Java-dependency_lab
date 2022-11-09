package org.example;

public class Dinosaur implements Attacker{
    public String name;
    public int attackPower;

    public Dinosaur(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks with it's jaws for " + this.attackPower + " damage!");
    }
}
