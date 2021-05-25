package com.company.zad4;

class Uruchamialna implements Runnable{
    public boolean uruchomiony = true;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " rozpoczęto");
        while(uruchomiony) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " zakończono");
    }
}

public class StartStop {
    public static void main(String[] args) {
        Uruchamialna r01 = new Uruchamialna();
        Uruchamialna r02 = new Uruchamialna();

        Thread t1 = new Thread(r01, "T1");
        Thread t2 = new Thread(r02, "T2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r01.uruchomiony = false;
        r02.uruchomiony = false;

    }
}
