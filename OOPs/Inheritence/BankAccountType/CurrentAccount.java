package OOPs.BankAccountType;

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println(" Insufficient balance.");
            return false;
        }
    }
}