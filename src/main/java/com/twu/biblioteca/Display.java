package com.twu.biblioteca;

import java.util.Scanner;

public class Display {
    Scanner sc;

    public void print(String information) {
        System.out.println(information);
    }

    public int inputMenuOption() {
        sc = new Scanner(System.in);
        System.out.println("Choose an option at the menu: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}