package com.company.softDrink;


public class Fanta extends SoftDrink {
    public Fanta(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Fanta() {
    }

    @Override
    public String toString() {
        return "Fanta{}";
    }
}
