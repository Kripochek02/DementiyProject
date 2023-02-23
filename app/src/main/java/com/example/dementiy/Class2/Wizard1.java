package com.example.dementiy.Class2;

public class Wizard1 extends Unit1 {
    protected int mana;
    public Wizard1(String name, String ip, int m) {
        super(name, ip);
        this.mana = m;
    }
    public void move(){
        System.out.println("дет волшебник");
    }
    @Override
    public void attack(Unit1 enemy) {
        this.hp -= 60;
        System.out.println("-60HP у противника" + enemy.name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana =" + this.mana);
    }
}
