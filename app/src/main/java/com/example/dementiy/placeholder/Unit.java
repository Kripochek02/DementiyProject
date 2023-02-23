package com.example.dementiy.placeholder;

class Unit {
    protected String name;
    protected int hp;
    private String ip;

    public Unit(String name, String ip) {
        this.name = name;
        this.ip = ip;
        this.hp = 100;
    }

    public void printInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Ip:" + this.ip);
    }

    public void attack(Unit enemy) {
        enemy.hp -= 50;
        System.out.println("Мы атаковали" + enemy.name);
    }
}