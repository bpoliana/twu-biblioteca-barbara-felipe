package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class DisplayTest {

    public Display display = new Display();
    public PrintStream printStream;

    @Test
    public void TestInputMenuOption() {
        InputStream userInput = new ByteArrayInputStream("1".getBytes());
        System.setIn(userInput);
        assertThat(1, is(display.inputMenuOption()));
    }

    @Test
    public void TestMenuValidOption() {
        assertTrue(display.isValidOption(1));
        assertFalse(display.isValidOption(3 ));
    }

}
