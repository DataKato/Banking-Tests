package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionsTestTest {

    BankTransactions BT = new BankTransactions();
    @Test
    void withdraw() {
        int RemainingBalance = BT.Withdraw(1000, 300);
        assertEquals(700, RemainingBalance);
    }

    @Test
    void deposit() {
        int RemainingBalance = BT.Withdraw(1000, 300);
        assertEquals(1300, RemainingBalance);
    }
}