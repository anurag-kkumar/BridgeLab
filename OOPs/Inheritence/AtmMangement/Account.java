package OOPs.AtmMangement;

public class Account {
    Long accountNumber ;
    String holderName;
    Long balance;
    Account(Long accountNumber,String holderName,Long balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    Long setAccountNumber(long accountNumber){
        return accountNumber;
    }
}
