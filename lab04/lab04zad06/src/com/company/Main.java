package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount ac01 = new SavingsAccount(5000, 0.01);
        SavingsAccount ac02 = new SavingsAccount(10000, 0.02);

        ac01.deposit(1000);
        ac01.transfer(1000, ac02);

        ac01.withdraw(500);
        ac02.withdraw(500);

        ac01.deposit(ac01.calculateInterest());
        ac02.deposit(ac02.calculateInterest());

        System.out.println(ac01);
        System.out.println(ac02);
    }
}

class BankAccount{
    // Stan rachunku bankowego
    double balance = 0;

    // Tworzenie pustego konta
    public BankAccount(){

    }

    // Tworzenie konta z saldem początkowym
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Zwracanie aktualnego salda
    public double getBalace(){
        return balance;
    }

    // Zwiększanie salda na koncie
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }

    }

    // Zmniejszanie salda na koncie
    public void withdraw(double amount){
        if(amount > 0){
            balance -= amount;
        }

    }

    // Przelewanie kwoty z jednego konta na drugie
    public void transfer(double amount, BankAccount other){
        withdraw(amount);
        other.deposit(amount);
    }


}

class SavingsAccount extends BankAccount{
    double interestRate;

    // Tworzenie konta oszczędnościowego z określonym saldem początkowym i oprocentowaniem
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Obliczanie odsetek
    public double calculateInterest(){
        return balance * interestRate;
    }

    @Override
    public String toString(){
        return "SavingsAccount [interestRate=" + interestRate + ", balance=" + balance + "]";
    }
}
