package OOPs.AtmMangement;

public class ATM  extends Account{
    String location ;
    int machineId;

    public ATM(Long accountNumber, String holderName, Long balance, String location, int machineId) {
        super(accountNumber, holderName, balance);
        this.location = location;
        this.machineId = machineId;
    }

    ATM(Long accountNumber, String holderName, Long balance) {
        super(accountNumber, holderName, balance);
    }

    public static void main(String[] args) {

    }

}
