package com.company.user;

public class Wallet {
    private Integer money;

    public Wallet(Integer money) {
        if (money >= 0) {
            this.money = money;
        }else throw new RuntimeException();
    }

    public Wallet() {
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        if (money >= 0) {
            this.money = money;
        }else throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wallet wallet = (Wallet) o;

        return money != null ? money.equals(wallet.money) : wallet.money == null;
    }

    @Override
    public int hashCode() {
        return money != null ? money.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}
