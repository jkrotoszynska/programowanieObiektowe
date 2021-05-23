package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            throw new MojWyjatek("To jest moj wyjatek");
        } catch (MojWyjatek mojWyjatek) {
            System.out.println(mojWyjatek.getMessage());
        }
    }
}

class MojWyjatek extends Exception {
    public MojWyjatek() {
    }

    public MojWyjatek(String message) {
        super(message);
    }

    public MojWyjatek(String message, Throwable cause) {
        super(message, cause);
    }

    public MojWyjatek(Throwable cause) {
        super(cause);
    }

    public MojWyjatek(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}