package com.company.chips;

public class Pringls extends Chips {
    public Pringls(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Pringls() {
    }

    @Override
    public String toString() {
        return "Pringls{}";
    }
}
