package OOPs.BankAccountType;

import java.util.Date;

class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;
    // to set the data
    public Transaction(String transactionId, Date date, double amount, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }
    // to get the data
    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date +
                ", Amount: " + amount + ", Type: " + type;
    }
}

