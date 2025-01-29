package org.example;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionsTest {
    public int Withdraw(int Balance, int amount){
        return  (Balance - amount);
    }

    public int Deposit(int Balance, int amount){
        return  (Balance + amount);
    }
}