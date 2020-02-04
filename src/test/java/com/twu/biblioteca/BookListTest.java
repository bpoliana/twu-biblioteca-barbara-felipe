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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookListTest {

    public BookList bookList = new BookList();

    @Test
    public void listAllBooks() throws Exception {
        assertNotNull(bookList.getBookList());
    }

    @Test
    public void booksWithAuthor() throws Exception {
//        when(bookList.getBookList())
//                .thenReturn(Arrays.asList( new Book ("The name of the wind", "Patrick Rothfuss", 2007),
//                                            new Book ("Fahrenheit 451", "Ray Bradhury", 1953),
//                                            new Book ("Cosmos", "Carl Sagan", 1970) ));

        List list = bookList.getBookList();
        assertEquals("Patrick Rothfuss", ((Book) list.get(0)).getAuthor());
        assertEquals(2007, ((Book) list.get(0)).getYear());
    }
}
