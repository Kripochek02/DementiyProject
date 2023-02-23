package com.example.dementiy.placeholder;

import java.util.Iterator;

public class LinkedMain {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);
        Iterator<String> i = list.iterator();
        while(i.hasNext()) {
            String v = i.next();
            System.out.println(i.next());
        }
        for(String v: list) {
            System.out.println(v);
        }
    }
}
