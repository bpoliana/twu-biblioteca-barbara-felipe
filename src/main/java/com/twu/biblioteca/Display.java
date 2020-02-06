package com.twu.biblioteca;

import java.util.Scanner;

public class Display {
    Scanner sc = new Scanner(System.in);

    public void print(String information) {
        System.out.println(information);
    }

    public int inputMenuOption() {
        System.out.println("Choose an option at the menu: ");
        return sc.nextInt();
    }




}
