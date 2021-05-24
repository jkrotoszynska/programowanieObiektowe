package com.company;

class KlasaUruchamialna implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
	Thread t1 = new Thread(new KlasaUruchamialna(), "Nazwa wątku z KlasaUruchamialna");
	t1.start();
    }
}
