package com.google.code.cesspool;

import java.util.Observable;
import java.util.Observer;

/**
 * Hello world!
 * 
 */
public class App implements Observer {
    public static void main(String[] args) {
        new App().update(null, null);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hello World!");
    }
}
