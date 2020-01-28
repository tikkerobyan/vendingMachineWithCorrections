package com.company.sweet;


public class Snickers extends Sweet {
    public Snickers(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Snickers() {
    }

    @Override
    public String toString() {
        return "Snickers{}";
    }
}
