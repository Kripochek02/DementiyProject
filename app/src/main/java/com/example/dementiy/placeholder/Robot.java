package com.example.dementiy.placeholder;

public class Robot extends Unit {
    int armor;
    public Robot(String name, String ip, int armor ) {
        super(name, ip);
        this.armor = armor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor -" + this.armor);
    }
}
