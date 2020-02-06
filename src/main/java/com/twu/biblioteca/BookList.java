package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class BookList {
    public List<Book> bookList;

    public BookList() {
        this.bookList = Arrays.asList( new Book ("The name of the wind", "Patrick Rothfuss", 2007),
                                        new Book ("Fahrenheit 451", "Ray Bradhury", 1953),
                                            new Book ("Cosmos", "Carl Sagan", 1970));
    }

    public List getBookList() {
        return bookList;
    }

    public String printBookList() {
        String list = "";
        for (Book book : bookList) {
            list += book.toString() + "\n";
        }
        return list;
    }

}
