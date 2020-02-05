package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        Message welcomeMessage = new Message();
        BookList bookList = new BookList();

        ScreenInteraction console = new ScreenInteraction(welcomeMessage, bookList);

        console.execute();
    }
}
