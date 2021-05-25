package com.company.brudnopis;

class Klasa implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Klasa(), "NazwaWatku");
        t1.start();
    }
}