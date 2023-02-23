package com.example.dementiy.placeholder;

public class MyHouse {
    boolean hazPizza = false;
    public synchronized void eatPizza() {
        while (!hazPizza) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ням ням");
    }
    public synchronized void pizzaGuy() {
        hazPizza = true;
        notifyAll();
    }

    public static void main(String[] args) {
        MyHouse house = new MyHouse();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                house.eatPizza();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                house.pizzaGuy();
            }
        };
        t1.start();
        t2.start();
    }
}
