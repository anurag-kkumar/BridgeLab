package OOPs.AtmMangement;

public class Transaction extends Account{

    int trasactionId;
    int date;
    int ammount ;
    String type;
    public Transaction(Long accountNumber, String holderName, Long balance, int trasactionId, int date, int ammount, String type) {
        super(accountNumber, holderName, balance);
        this.trasactionId = trasactionId;
        this.date = date;
        this.ammount = ammount;
        this.type = type;
    }




}
