package com.company.zad2;

class KlasaUruchamialna extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new KlasaUruchamialna();
        t1.start();
    }
}
