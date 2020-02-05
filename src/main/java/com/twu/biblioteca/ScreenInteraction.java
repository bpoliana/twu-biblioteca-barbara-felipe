package com.twu.biblioteca;

import java.util.Scanner;

public class ScreenInteraction {
    private Message welcomeMessage = new Message();
    private BookList bookList = new BookList();
    private Display display = new Display();

    public ScreenInteraction(Message welcomeMessage, BookList bookList){
        this.welcomeMessage = welcomeMessage;
        this.bookList = bookList;
    }

    public void execute(){
        display.print(welcomeMessage.welcomeMessage());
        display.print("Books:");
        display.print(bookList.getBookList().toString());
    }
}
