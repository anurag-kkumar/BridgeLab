package OOPs.BankAccountType;

import java.util.ArrayList;
import java.util.List;

//Account class
class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
