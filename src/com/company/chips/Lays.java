package com.company.chips;

public class Lays extends Chips {
    public Lays(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Lays() {
    }

    @Override
    public String toString() {
        return "Lays{}";
    }
}
