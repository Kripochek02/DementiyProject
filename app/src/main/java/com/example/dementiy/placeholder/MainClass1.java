package com.example.dementiy.placeholder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainClass1 {
    public static void main(String[] args) {
        String[] a  = new String[10];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, "nya");
        System.out.println(Arrays.toString(a));
        Integer[] a2 = {4, 8, 7, 11, 78, 6};
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.binarySearch(a2, 8));
        System.out.println(Arrays.binarySearch(a, "nya"));

        ArrayList<Double> list = new ArrayList<>();
        list.add(12.34);
        list.add(15.34);
        list.add(12.35);
        list.add(88.79);
        list.add(12.34);
        list.add(16.34);
        list.add(17.35);
        list.add(88.77);
        list.add(15.34);
        list.add(12.37);
        list.add(88.324);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(4);
        list.remove(0);
        System.out.println(list);
        Double [] array = {1D, 2D, 3D, 4D};
        Arrays.sort(array, new ReverseCmp());
        for (Object next : list) {
            System.out.println(next + " ");
        }
        ArrayList<String> monthList = new ArrayList<>();
        monthList.add("Jan");
        for (String next: monthList) {
            System.out.println(next);
        }
        //monthList.
    }
    static class ReverseCmp implements Comparator<Double> {
        @Override
        public int compare(Double d1, Double d2) {
            return (int)(d2-d1);
        }
    }
}
