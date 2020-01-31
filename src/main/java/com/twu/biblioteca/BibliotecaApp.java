package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Message welcomeMessage = new Message();
        System.out.println(welcomeMessage.welcomeMessage());

        BookList list = new BookList();
        System.out.println("Books:");
        System.out.println(list.getBookList().toString());
    }
}
