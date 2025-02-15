package org.JUnitTest.testingBankingTransactions;

public class BankingTransactions {
        public double balance;

       public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

       public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

       public double getBalance() {
            return balance;
        }
}
