package com.example.dementiy.placeholder;

public class Car {
    public static int wheelCount = 4;
    private String model = "Жигуль";
    public void ride() {
        System.out.println("Едем");
    }
    public class Wheel{
        private int radius = 17;
        void rotate() {
            System.out.println(model);
        }
    }
}
