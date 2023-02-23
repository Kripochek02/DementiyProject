package com.example.dementiy.placeholder;

public class Story {
    public Situation currentSituation;

    public Story(Situation currentSituation) {
        this.currentSituation = currentSituation;
    }
    public boolean isEnd() {
        return this.currentSituation.direction.length == 0;

    }

    public void go(int a) {
        if (a > 0 && a <= this.currentSituation.direction.length) {
            this.currentSituation = this.currentSituation.direction[a-1];
        } else {
            System.out.println("Будь внимательнее");
        }
    }
}
