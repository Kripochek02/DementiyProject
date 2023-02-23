package com.example.dementiy.Class2;

public class CarMain {
    public static void main(String[] args) {

        System.out.println(Car.wheelCount);
        System.out.println(Math.pow(3,5));
        Car auto = new Car();
        Car.Wheel w = new Car.Wheel();
        System.out.println(auto);
        System.out.println(w);
        class Example{
            public String some;
            Example(){
                auto.setModel("Lada");
            }
        }
        System.out.println(new Example());
    }
}
