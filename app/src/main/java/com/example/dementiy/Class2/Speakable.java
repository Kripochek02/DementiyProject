package com.example.dementiy.Class2;

public interface Speakable {
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;
    public static void example(){
        System.out.println("Пример метожа с реализацией в интерфейсе");
    }
    public void speak();

    public default void run(){
        System.out.println("Я бегаю");
    }
}
