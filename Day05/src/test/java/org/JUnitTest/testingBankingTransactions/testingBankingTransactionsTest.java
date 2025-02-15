package org.JUnitTest.testingBankingTransactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testingBankingTransactionsTest {
    BankingTransactions account = new BankingTransactions();

    @Test
    void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        account.deposit(200.0);
        assertTrue(account.withdraw(100.0));
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawFailure() {
        assertFalse(account.withdraw(50.0));
        assertEquals(0.0, account.getBalance());
    }

}