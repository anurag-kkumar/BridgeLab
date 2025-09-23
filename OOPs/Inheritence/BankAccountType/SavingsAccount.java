package OOPs.BankAccountType;

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 10000;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        } else {
            System.out.println(" Cannot withdraw. Maintain minimum balance of ₹500.");
            return false;
        }
    }
}

