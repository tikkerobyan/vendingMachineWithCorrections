package com.company.sweet;


public class Twix extends Sweet {
    public Twix(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Twix() {
    }

    @Override
    public String toString() {
        return "Twix{}";
    }
}
