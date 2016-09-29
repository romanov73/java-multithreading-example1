package ru.ulstu.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleTask extends Thread {

    @Override
    public void run() {
        System.out.format("Hello form %s ", Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
