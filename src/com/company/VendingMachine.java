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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {

    private HashMap<String, ArrayList<LinkedList<Products>>> products;

    public VendingMachine(HashMap<String, ArrayList<LinkedList<Products>>> products) {
        this.products = products;
    }

    public VendingMachine() {
    }

    public void addProducts() {
        HashMap<String, ArrayList<LinkedList<Products>>> products = new HashMap<>();

        ArrayList<LinkedList<Products>> softDrinks = new ArrayList<>();
        LinkedList<Products> colas = new LinkedList<>();
        LinkedList<Products> pepsis = new LinkedList<>();
        LinkedList<Products> fantas = new LinkedList<>();

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


        ArrayList<LinkedList<Products>> chipses = new ArrayList<>();
        LinkedList<Products> layses = new LinkedList<>();
        LinkedList<Products> doritoses = new LinkedList<>();
        LinkedList<Products> pringlses = new LinkedList<>();

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


        ArrayList<LinkedList<Products>> sweets = new ArrayList<>();
        LinkedList<Products> kitkats = new LinkedList<>();
        LinkedList<Products> snickerses = new LinkedList<>();
        LinkedList<Products> twixes = new LinkedList<>();

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
            if (user.getWallet().getMoney() >= products.get(comand.getRow()).get(comand.getCollons() - 1).get(0).getCoast()) {
                products.get(comand.getRow()).get(comand.getCollons() - 1).remove(0);
                user.getWallet().setMoney(user.getWallet().getMoney() - products.get(comand.getRow()).get(comand.getCollons() - 1).get(0).getCoast());
                return products.get(comand.getRow()).get(comand.getCollons() - 1).get(0);
            } else throw new RuntimeException("No enough money");
        }
        throw new Exception("Incorrect Command");
    }

    //region

    public HashMap<String, ArrayList<LinkedList<Products>>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, ArrayList<LinkedList<Products>>> products) {
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
