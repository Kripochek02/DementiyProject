package com.example.dementiy.Class2;

public class Human extends Unit1{
    public void move(){
        System.out.println("Идет человек");
    }

    public Human(String name, String ip) {
        super(name, ip);
    }
}
