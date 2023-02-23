package com.example.dementiy.placeholder;

public class dadada{
    public String printString(String s) throws NullPointerException {
        if (s == null) {
            throw new java.lang.NullPointerException();
        }
        return(s + " " + s.length());
    }
}
