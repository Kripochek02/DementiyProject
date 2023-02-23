package com.example.dementiy.Class2;

public class Box {
    int width;
    int height;
    int depth;

    public Box(int[] arr) {
        arr[0] = width;
        arr[1] = height;
        arr[2] = depth;
    }

    public String toString() {
        return width + " x " + height + " x " + depth;
    }
}
