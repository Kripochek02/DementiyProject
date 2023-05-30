package com.example.dementiy.project;

public class Card {

    private String name;
    private String element;
    private int lvl;

    private int sila;

    public Card(String name, String element, int lvl){

        this.name=name;
        this.element=element;
        this.lvl=lvl;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }



}
