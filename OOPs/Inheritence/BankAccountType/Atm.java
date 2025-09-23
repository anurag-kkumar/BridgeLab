package OOPs.BankAccountType;

abstract class Atm implements TransactionLogger {
    protected String location;
    protected String machineId;

    public Atm(String location, String machineId) {
        this.location = location;// to fix the atm postions to track the machine
        this.machineId = machineId;// each machine has id
    }

    public abstract void withdraw(Account account, double amount);
    public abstract void deposit(Account account, double amount);

    public void logTransaction(Transaction transaction) {
        System.out.println(" Transaction logged ,........:=> " + transaction);
    }
}
