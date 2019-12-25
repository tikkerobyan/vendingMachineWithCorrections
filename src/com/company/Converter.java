package com.company;

import java.util.Scanner;

public class Converter {
    public static Comand makeComand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Key!");
        String string = scanner.nextLine();
        String[] parts = string.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        Comand comand = new Comand();
        comand.setRow(part1);
        comand.setCollons(Integer.parseInt(part2));
        return comand;
    }
}
