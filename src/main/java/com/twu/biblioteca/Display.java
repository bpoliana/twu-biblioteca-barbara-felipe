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
        if (isValidOption(Integer.parseInt(sc.nextLine()))) {
            return 1;
        } return 0;
    }

    public boolean isValidOption(int option) {
        if (option == 1) {
            return true;
        }
        System.out.println("Please select a valid option.");
        return false;
    }
}