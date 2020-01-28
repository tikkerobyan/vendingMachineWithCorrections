package com.company.user;

import com.company.Products;
import com.company.VendingMachine;
import com.company.command.Comand;

public class User {
    private Wallet wallet;

    public User(Wallet wallet) {
        this.wallet = wallet;
    }

    public User() {
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return wallet != null ? wallet.equals(user.wallet) : user.wallet == null;
    }

    @Override
    public int hashCode() {
        return wallet != null ? wallet.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "wallet=" + wallet +
                '}';
    }
}
