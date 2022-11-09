package org.example;


public class Robot {

    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;


    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Gir";
        this.weapon = weapon;
    }

    //Methods(CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with his " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }

}
