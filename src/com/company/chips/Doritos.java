package com.company.chips;

public class Doritos extends Chips {
    public Doritos(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Doritos() {
    }

    @Override
    public String toString() {
        return "Doritos{}";
    }
}
