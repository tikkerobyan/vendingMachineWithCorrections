package com.company.softDrink;


public class Pepsi extends SoftDrink {
    public Pepsi(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{}";
    }
}
