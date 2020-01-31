package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void showsWelcomeMessage() {
        Message welcomeMessage = new Message();
        assertEquals("Oi oi Biblioteca!", welcomeMessage.welcomeMessage());
    }
}
