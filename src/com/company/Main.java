package com.company;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            Products product = vendingMachine.getProduct(Converter.makeComand());
            product.printInfo();
        }catch (Exception ex){
            System.out.println("Incorrect Command");
        }

    }
}


