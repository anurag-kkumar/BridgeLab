package CoreJava.Oop_Practics3;

public class BankAccountSystem {

    static String BankName="Bank of india";
   final long accountNum;
    String accountHolderName ;
     static int numberAcc=0;
    static void getTotalAccounts(){

        System.out.println(numberAcc);

    }
BankAccountSystem(long accountNum,String accountHolderName){
        this.accountNum=accountNum;
        this.accountHolderName=accountHolderName;
        numberAcc++;

}
void display(){
    System.out.println(accountHolderName+" "+accountNum +" "+BankName);

}

    public static void main(String[] args) {
        BankAccountSystem account1=new BankAccountSystem(5872107351L,"Anurag kumar");

        account1.display();
        System.out.println(account1 instanceof BankAccountSystem);
        BankAccountSystem account2=new BankAccountSystem(5872107353L,"Anurag kumar");

        account1.display();
        System.out.println(account2 instanceof BankAccountSystem);
        BankAccountSystem.getTotalAccounts();
    }
}
