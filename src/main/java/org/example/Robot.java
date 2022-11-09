package org.example;

import java.sql.SQLOutput;

public class Robot {

    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    //Constructor
    public Robot() {
        this.name = "Gir";
        this.weaponName = "Self-destruct";
        this.weaponPower = 50;
    }

    //Methods(CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with his " + this.weaponName + " for " + this.weaponPower + " damage!");
    }

}
