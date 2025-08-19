package CoreJava.Java_OOP;

public class Account {
    String accountHolder;
    int balance;
    Account(){
         accountHolder="Username";
        balance=0;

    }

    public static void main(String[] args) {
        Account user1=new Account();
        System.out.println(user1.accountHolder);
        System.out.println(user1.balance);
    }
}
