package com.google.code.cesspool;

import static org.junit.Assert.*;

import java.util.Observable;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest extends Observable {

    @Test
    public void testApp() {
        this.addObserver(new App());
        this.setChanged();
        this.notifyObservers();
        assertTrue(true);
    }
}
