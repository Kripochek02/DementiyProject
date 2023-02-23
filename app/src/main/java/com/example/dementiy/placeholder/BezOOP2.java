package com.example.dementiy.placeholder;

import java.util.Scanner;

public class BezOOP2 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;
        double mult = 1;
        for (int i = 0; i <n; i++) {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextInt();
            double y = scanner.nextInt();
            sum += x/y;
            mult *= x/y;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
