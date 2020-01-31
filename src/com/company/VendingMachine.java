package com.company;


import com.company.chips.Doritos;
import com.company.chips.Lays;
import com.company.chips.Pringls;
import com.company.softDrink.Cola;
import com.company.softDrink.Fanta;
import com.company.softDrink.Pepsi;
import com.company.sweet.KitKat;
import com.company.sweet.Snickers;
import com.company.sweet.Twix;
import com.company.command.Comand;
import com.company.user.User;

import java.util.*;

public class VendingMachine {

    private HashMap<String, ArrayList<Queue<Products>>> products;


    public VendingMachine() {
        addProducts();
    }

    private void addProducts() {
        HashMap<String, ArrayList<Queue<Products>>> products = new HashMap<>();

        ArrayList<Queue<Products>> softDrinks = new ArrayList<>();
        Queue<Products> colas = new LinkedList<>();
        Queue<Products> pepsis = new LinkedList<>();
        Queue<Products> fantas = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Cola cola = new Cola(300);
            Pepsi pepsi = new Pepsi(300);
            Fanta fanta = new Fanta(300);
            colas.add(cola);
            pepsis.add(pepsi);
            fantas.add(fanta);
        }
        softDrinks.add(colas);
        softDrinks.add(pepsis);
        softDrinks.add(fantas);


        ArrayList<Queue<Products>> chipses = new ArrayList<>();
        Queue<Products> layses = new LinkedList<>();
        Queue<Products> doritoses = new LinkedList<>();
        Queue<Products> pringlses = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Lays lays = new Lays(450);
            Doritos doritos = new Doritos(450);
            Pringls pringls = new Pringls(450);
            layses.add(lays);
            doritoses.add(doritos);
            pringlses.add(pringls);
        }
        chipses.add(layses);
        chipses.add(doritoses);
        chipses.add(pringlses);


        ArrayList<Queue<Products>> sweets = new ArrayList<>();
        Queue<Products> kitkats = new LinkedList<>();
        Queue<Products> snickerses = new LinkedList<>();
        Queue<Products> twixes = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            KitKat kitKat = new KitKat(200);
            Snickers snickers = new Snickers(200);
            Twix twix = new Twix(200);
            kitkats.add(kitKat);
            snickerses.add(snickers);
            twixes.add(twix);
        }
        sweets.add(kitkats);
        sweets.add(snickerses);
        sweets.add(twixes);

        products.put("A", softDrinks);
        products.put("B", chipses);
        products.put("C", sweets);

        setProducts(products);
    }

    public Products getProduct(Comand comand, User user) throws Exception {
        if (products.containsKey(comand.getRow())) {
            if (user.getWallet().getMoney() >= products.get(comand.getRow()).get(comand.getCollons() - 1).peek().getCoast()) {
                if (products.get(comand.getRow()).get(comand.getCollons() - 1).isEmpty()) {
                    System.out.println("Machine doesn't have that product !!");
                } else {
                    user.getWallet().setMoney(user.getWallet().getMoney() - products.get(comand.getRow()).get(comand.getCollons() - 1).peek().getCoast());
                    return products.get(comand.getRow()).get(comand.getCollons() - 1).remove();
                }
            } else throw new RuntimeException("No enough money");
        }
        throw new Exception("Incorrect Command");
    }

    //region

    public HashMap<String, ArrayList<Queue<Products>>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, ArrayList<Queue<Products>>> products) {
        this.products = products;
    }


    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendingMachine that = (VendingMachine) o;

        return products != null ? products.equals(that.products) : that.products == null;
    }

    @Override
    public int hashCode() {
        return products != null ? products.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
}
