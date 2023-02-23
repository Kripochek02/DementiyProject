package com.example.dementiy.Class2;

public abstract class Unit1 implements Speakable{
    protected int hp;
    protected String name;
    protected String ip;
    public Unit1(String name, String ip){
        this.hp = 100;
        this.name = name;
        this.ip = ip;
    }

    public abstract void move();

    @Override
    public void speak() {
        System.out.println("Меня зовут" + this.name);
    }

    public void printInfo(){
        System.out.println("HP = " + hp);
        System.out.println("Name = " + name);
        System.out.println("IP = " + ip);
    }
    public  void attack(Unit1 enemy){
        enemy.hp -= 50;
        System.out.println("Мы атаковали " + enemy.name);

    }
}
