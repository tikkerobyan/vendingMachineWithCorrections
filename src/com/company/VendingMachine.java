package com.company;


import com.company.Chips.Chips;
import com.company.Chips.Doritos;
import com.company.Chips.Lays;
import com.company.Chips.Pringls;
import com.company.SoftDrink.Cola;
import com.company.SoftDrink.Fanta;
import com.company.SoftDrink.Pepsi;
import com.company.SoftDrink.SoftDrink;
import com.company.Sweet.KitKat;
import com.company.Sweet.Snickers;
import com.company.Sweet.Sweet;
import com.company.Sweet.Twix;
import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {

    private HashMap<String, List<Products>>products;

    public VendingMachine() {

        this.products = new HashMap<>();
        addProducts();
    }

    private void addProducts(){

        ArrayList<Products> softDrinks = new ArrayList<>();

        Cola cola = new Cola();
        Pepsi pepsi = new Pepsi();
        Fanta fanta = new Fanta();

        softDrinks.add(cola);
        softDrinks.add(pepsi);
        softDrinks.add(fanta);
        ArrayList<Products> chips = new ArrayList<>();

        Lays lays = new Lays();
        Doritos doritos = new Doritos();
        Pringls pringls = new Pringls();

        chips.add(lays);
        chips.add(doritos);
        chips.add(pringls);

        ArrayList<Products> sweets = new ArrayList<>();

        Snickers snickers = new Snickers();
        Twix twix = new Twix();
        KitKat kitkat = new KitKat();

        sweets.add(snickers);
        sweets.add(twix);
        sweets.add(kitkat);

        products.put("A", softDrinks);
        products.put("B",chips);
        products.put("C",sweets);

    }

    public Products getProduct(Comand comand) throws Exception {
        if(products.containsKey(comand.getRow())){
            return products.get(comand.getRow()).get(comand.getCollons()-1);
        }
        throw new Exception("Incorrect Command");

    }

    //region

    public HashMap<String, List<Products>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, List<Products>> products) {
        this.products = products;
    }

    //endregion
}
