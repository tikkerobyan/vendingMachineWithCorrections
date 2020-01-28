package com.company.command;

public class Comand {
    private String row;
    private int collons;

    public Comand(String row, Integer collons) {
        this.row = row;
        if (collons >= 1 && collons <= 3) {
            this.collons = collons;
        } else throw new RuntimeException();
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getCollons() {
        return collons;
    }

    public void setCollons(int collons) {
        if (collons >= 1 && collons <= 3) {
            this.collons = collons;
        }
        throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comand comand = (Comand) o;

        if (collons != comand.collons) return false;
        return row != null ? row.equals(comand.row) : comand.row == null;
    }

    @Override
    public int hashCode() {
        int result = row != null ? row.hashCode() : 0;
        result = 31 * result + collons;
        return result;
    }

    @Override
    public String toString() {
        return "Comand{" +
                "row='" + row + '\'' +
                ", collons=" + collons +
                '}';
    }
}
