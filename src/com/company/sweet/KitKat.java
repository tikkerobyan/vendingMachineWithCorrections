package com.company.sweet;


public class KitKat extends Sweet {
    public KitKat(Integer coast) {
        if (coast >= 0) {
            this.setCoast(coast) ;
        }else throw new RuntimeException();
    }

    public KitKat() {
    }

    @Override
    public String toString() {
        return "KitKat{}";
    }
}
