package com.company;

import com.company.command.Converter;
import com.company.user.User;
import com.company.user.Wallet;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProducts();
        try {
            User user = new User(new Wallet(500));
            Products product = vendingMachine.getProduct(Converter.makeComand(), user);
            System.out.println(product);
            System.out.println(vendingMachine);
            System.out.println(user);
        } catch (Exception ex) {
            System.out.println("Incorrect Command");
        }
    }
}


