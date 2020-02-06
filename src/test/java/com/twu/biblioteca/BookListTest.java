package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookListTest {

    public BookList bookList = new BookList();

    @Test
    public void listAllBooks() throws Exception {
        assertNotNull(bookList.getBookList());
    }

    @Test
    public void booksWithAuthor() throws Exception {
        List list = bookList.getBookList();
        assertEquals("Patrick Rothfuss", ((Book) list.get(0)).getAuthor());
    }

    @Test
    public void booksWithYear() throws Exception {
        List list = bookList.getBookList();
        assertEquals(2007, ((Book) list.get(0)).getYear());
    }
}
