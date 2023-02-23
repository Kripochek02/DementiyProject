package com.example.dementiy.placeholder;

public class CarMain {
    public static void main(String[] args) {
        Car auto = new Car();
        Car.Wheel w = auto.new Wheel();
        Car.Wheel w2 = auto.new Wheel();
        Car.Wheel w3 = auto.new Wheel();
        Car.Wheel w4 = auto.new Wheel();
        w2.rotate();
        auto.ride();
    }
}
