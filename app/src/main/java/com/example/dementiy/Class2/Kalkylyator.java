package com.example.dementiy.Class2;

import java.util.Scanner;

public class Kalkylyator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int An = in.nextInt();
        int Bn = in.nextInt();
        int Bd = in.nextInt();
        double x = (An/Bn + 3);
        double x1 = (Bn/Bd - 1/3);
        double x3 = (x/x1);
        System.out.println(x3);
    }
}
