package com.example.dementiy.Class2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n = 5;
        Fraction sum = new Fraction();
        Fraction mult = new Fraction(1,1);
        for (int i = 0; i <= n; i++) {
            Fraction next = new Fraction();
            next.nextFraction();
            sum.add(next);
            mult.multiply(next);
        }
        System.out.println(sum);
        mult.print();
    }
}
