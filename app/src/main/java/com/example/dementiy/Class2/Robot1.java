package com.example.dementiy.Class2;

public class Robot1 extends Unit1{
    int armor;

    public Robot1(String name, String ip,int armor) {
        super(name, ip);
        this.armor = armor;
    }

    @Override
    public void move() {
        System.out.println("Идет робот");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor =" + this.armor);
    }
}
