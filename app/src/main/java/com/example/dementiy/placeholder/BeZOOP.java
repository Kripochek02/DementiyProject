package com.example.dementiy.placeholder;

import java.util.Scanner;

public class BeZOOP {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        int n = 5;
        Fraction [] list = new Fraction[n];
        Fraction sum = new Fraction();
        Fraction mult = new Fraction(1,1);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Fraction();
            list[i].nextFraction();
            sum.add(list[i]);
            mult.multiply(list[i]);
        }
        System.out.println("Sum");
        sum.print();
        System.out.println("Mult");
        mult.print();
    }
}
