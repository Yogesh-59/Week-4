package org.bankTransactionSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(2928.0);
        try {
            account.withdraw(600.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
