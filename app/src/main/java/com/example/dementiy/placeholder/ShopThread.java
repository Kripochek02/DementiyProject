package com.example.dementiy.placeholder;

public class ShopThread extends Thread {
    private Client client;

    static class Client {
        Integer balance;

        public Client(Integer balance) {
            this.balance = balance;
        }

        public void pay(int cost) {
            synchronized (this) {
                if (balance > cost) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    balance -= cost;
                } else {
                    System.out.println("No money");
                }
                System.out.println(balance);

            }

        }

        Client client;

        public void run() {
            synchronized (client) {
                client.pay(70);
            }
        }

        public static void main(String[] args) {
            Client client = new Client(100);
            ShopThread shop1 = new ShopThread();
            ShopThread shop2 = new ShopThread();
            shop1.client = client;
            shop2.client = client;
            shop1.start();
            shop2.start();
        }
    }
}