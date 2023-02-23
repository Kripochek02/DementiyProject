package com.example.dementiy.Class2;

public final class Radio implements Speakable, Comparable{
    @Override
    public void speak() {
        System.out.println("звучит 104.6FM");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
