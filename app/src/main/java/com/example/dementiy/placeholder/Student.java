package com.example.dementiy.placeholder;

import java.util.Locale;

public class Student {
    public String name;
    public int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Integer division(int a, int b) throws MyFirstException {
        if (rating < 4) {
            try {
            } catch (ArithmeticException e) {
                return  0;
            }  catch (NullPointerException e) {
                System.out.println("ERRORRRRRRR");
               // throw e;
                throw new MyFirstException();
            }
        }
        try {
            return a / b;
        } catch(ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
            return null;
        }
    }
}
