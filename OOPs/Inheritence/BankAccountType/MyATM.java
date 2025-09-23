package OOPs.BankAccountType;

import java.util.Date;
import java.util.UUID;

class MyATM extends Atm {

    public MyATM(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        boolean success = false;

        if (account instanceof SavingsAccount) {
            success = ((SavingsAccount) account).withdraw(amount);
        } else if (account instanceof CurrentAccount) {
            success = ((CurrentAccount) account).withdraw(amount);
        }

        if (success) {
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            account.transactions.add(t);
            logTransaction(t);
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.balance += amount;
        Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
        account.transactions.add(t);
        logTransaction(t);
    }
}
