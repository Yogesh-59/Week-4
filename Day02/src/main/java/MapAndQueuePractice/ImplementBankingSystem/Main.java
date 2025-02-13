package MapAndQueuePractice.ImplementBankingSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount("B001", 5000.00);
        bank.addAccount("S002", 3000.00);
        bank.addAccount("C003", 7000.00);

        bank.deposit("B001", 2000.00);
        bank.requestWithdrawal("S002");
        bank.requestWithdrawal("C003");

        bank.displaySortedAccounts();
        bank.processWithdrawals();
    }
}
