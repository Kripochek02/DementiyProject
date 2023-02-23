package com.example.dementiy.placeholder;

public class UnitsFIGTING {
    public static void main(String[] args) {
        Wizard w = new Wizard("Dedinside", "3.3", 50);
        Robot r = new Robot("Dedinsidik", "2.2", 50);
        Unit u = new Unit("ded", "1.1");
        Unit[] list = {w,r,u};
        for (Unit next: list) {
            next.printInfo();
        }
        u.printInfo();
        r.printInfo();
        w.printInfo();
        u.attack(w);
        w.printInfo();

    }
}
