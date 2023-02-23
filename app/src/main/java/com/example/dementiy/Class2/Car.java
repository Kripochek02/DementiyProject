package com.example.dementiy.Class2;

public class Car {
    public static int wheelCount = 4;
    private String model = "BMV";
    public void setModel(String model){
        this.model = model;
    }
    public void ride(){
        System.out.println("Едем");
    }
    public static class Wheel{
        private int radius = 17;
    }
    public  enum Month{
        JAN, FEB, MAR, APR
    }
}
