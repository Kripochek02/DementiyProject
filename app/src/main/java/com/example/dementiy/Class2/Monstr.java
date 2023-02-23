package com.example.dementiy.Class2;

public class Monstr {
        String name;
        int health;
        int armor;

        Monstr(String name, int health, int armor) {
            this.name = name;
            this.health = health;
            this.armor = armor;
        }



        public String toString() {
            return "Name: " + name + "\n" +
                    "Health: " + health + "\n" +
                    "Armor: " + armor;
        }
}