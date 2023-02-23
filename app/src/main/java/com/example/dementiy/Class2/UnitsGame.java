package com.example.dementiy.Class2;

public class UnitsGame {
    public static void main(String[] args) {
        Robot1 r = new Robot1("r2d2","10102",100);
        Wizard1 w = new Wizard1("Gendalf","23230",10);
        Unit1 u = new Unit1("Vasya","30232"){
            @Override
            public void move() {
                System.out.println(1);
            }
        };
        Speakable s = new Speakable() {
            @Override
            public void speak() {
                System.out.println("Я умею говорить, хотя меня никак не зовут");
            }
        };
        u.move();
        r.attack(w);
        r.attack(r);
        u.attack(r);
        w.attack(u);
    }
}
