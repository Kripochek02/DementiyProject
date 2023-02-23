package com.example.dementiy.placeholder;

import java.util.Scanner;

public class Quest {

    public Quest(Story story, Character c) {
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int K=1,A=100,P=50;
        System.out.println("Вы прошли собеседование и вот-вот станете сотрудником компании по обману покупателей. \n Осталось уладить формальности - подпись под договором (Введите ваше имя):");
        String name;
        name=in.next();
        System.out.println("=====\nКарьера:"+K+"\tАктивы:"+A+"т.р.\tРепутация:"+P+"%\n=====");
        System.out.println("В первый же рабочий день вы нашли клиента, которому нужны компьютеры для офиса, и вы продаете ему \n Коробок с готовыми компьютерами.");
        System.out.println("- (1)клиента можно обмануть и вы отправляете пустые коробки по завышенной цене \n Box pc ULTRA по 150");
        System.out.println("- (2)клиента можно чуть-чуть обмануть и отправить не те коробки \n ULTIMATE по 100");
        System.out.println("- (3)вы отправите то, что нужно клиенту Default по 50");
        int a1=in.nextInt();
        if(a1==1){
            K+=10;A+=-150;P+=-10;
            System.out.println("=====\nКарьера:"+K+"\tАктивы:"+A+"т.р.\tРепутация:"+P+"%\n=====");
            System.out.println("На вас подали в суд, но на вас это не как не повлияло так, как ваша компания не существовала легально. Спустя день вас избили.");
            int a2 = in.nextInt();
            if (a2 == 1){
                System.out.println("=====\nКарьера:"+K+"\tАктивы:"+A+"т.р.\tРепутация:"+P+"%\n=====");
                System.out.println("Вам пришли большие счета за лечение. \n Вам нужно его оплатить.");
                System.out.println("- (1)не платить за лечение");
                System.out.println("- (2)взять кредит");
                System.out.println("- (3)продать органы");
                int a3 = in.nextInt();
                if (a3 == 1){
                    System.out.println("(1)У вас отняло имущество государство и вы начали бомжевать");
                }
                if (a3 == 2){
                    System.out.println("(2)Вас избили коллекторы до смерти, за то, что вы не выплатили кредит");
                }
                if (a3 == 3){
                    System.out.println("(3)Вы начали бухать и у вас отказали органы. Вы умерли");
                }
            }
        } else if(a1==2) {
            K+=1;A+=100;P+=0;
            System.out.println("=====\nКарьера:"+K+"\tАктивы:"+A+"т.р.\tРепутация:"+P+"%\n=====");
            System.out.println("На вас подали в суд, но на вас это не как не повлияло так, как ваша компания не существовала легально");
        } else {
            K+=0; A+=50; P+=10;
            System.out.println("=====\nКарьера:"+K+"\tАктивы:"+A+"т.р.\tРепутация:"+P+"%\n=====");
            System.out.println("Вы получаете хороший отзыв");
        }
        System.out.println("Конец");
    }

    public void start() {

    }
}
