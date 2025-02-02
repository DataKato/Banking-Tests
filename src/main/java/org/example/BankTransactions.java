package org.example;

public class BankTransactions {
    public int Withdraw(int Balance, int amount){
        return  (Balance - amount);
    }

    public int Deposit(int Balance, int amount){
        return  (Balance + amount);
    }
}
