package com.company;

public abstract class Products {
    private Integer coast;

    public Products(Integer coast) {
        if (coast >= 0) {
            this.coast = coast;
        }else throw new RuntimeException();
    }

    public Products() {
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        if (coast >= 0) {
            this.coast = coast;
        }else throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        return coast != null ? coast.equals(products.coast) : products.coast == null;
    }

    @Override
    public int hashCode() {
        return coast != null ? coast.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Products{" +
                "coast=" + coast +
                '}';
    }
}
