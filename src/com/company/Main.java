package com.company;

import com.company.command.Converter;
import com.company.user.User;
import com.company.user.Wallet;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            User user = new User(new Wallet(6000000));
            System.out.println(vendingMachine.getProduct(Converter.makeComand(), user));
            System.out.println(vendingMachine);
            System.out.println(user);
        } catch (Exception ex) {
            System.out.println("Incorrect Command");
        }
    }
}


