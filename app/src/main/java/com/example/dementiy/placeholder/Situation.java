package com.example.dementiy.placeholder;

public class Situation {
    public int dK;
    public int dA;
    public int dR;
    public String text;
    public String subject;
    public Situation[] direction;
    public Situation(String t, String s, int dK, int dA, int dR, int n) {
        this.text = t;
        this.subject = s;
        this.dK = dK;
        this.dA = dA;
        this.dR = dR;
        this.direction = new Situation[n];
    }
}
