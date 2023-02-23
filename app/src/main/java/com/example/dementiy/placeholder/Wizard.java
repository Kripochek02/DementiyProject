package com.example.dementiy.placeholder;

public class Wizard extends Unit {

    private int mana;
    public Wizard(String name, String ip, int mana) {
        super(name, ip);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Mana:" + this.mana);
    }

    @Override
    public void attack(Unit enemy) {
        enemy.hp -=60;
        System.out.println("БУМММ" + enemy.name );
    }
}
