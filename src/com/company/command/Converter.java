package com.company.command;

import java.util.Scanner;

public class Converter {
    public static Comand makeComand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Key!");
        String string = scanner.nextLine();
        String[] parts = string.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        Comand comand = new Comand(part1, Integer.parseInt(part2));
        return comand;
    }

    @Override
    public String toString() {
        return "Converter{}";
    }
}
