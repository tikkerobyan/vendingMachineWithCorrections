package com.company.softDrink;


public class Cola extends SoftDrink {
    public Cola(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public Cola() {
    }

    @Override
    public String toString() {
        return "Cola{}";
    }
}
