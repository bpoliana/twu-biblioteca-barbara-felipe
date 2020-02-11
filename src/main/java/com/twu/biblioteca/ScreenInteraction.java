package com.twu.biblioteca;

import java.util.Scanner;

public class ScreenInteraction {
    private Message welcomeMessage = new Message();
    private BookList bookList = new BookList();
    private Menu menu = new Menu();
    private Display display = new Display();

    public ScreenInteraction(Message welcomeMessage, BookList bookList){
        this.welcomeMessage = welcomeMessage;
        this.bookList = bookList;
    }

    public void execute(){
        display.print(welcomeMessage.welcomeMessage());

        int option = 0;

        while(option != 9){
            display.print(menu.showMenu());
            option = display.inputMenuOption();

            switch(option) {
                case 1: display.print(bookList.printBookList());
                break;
                case 9: display.print("Goodbye Folk!");
                break;
                default: display.print("Please, select your option!");
                break;
            }
        }
    }
}
