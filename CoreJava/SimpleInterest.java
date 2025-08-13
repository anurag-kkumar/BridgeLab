package CoreJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int p= in.nextInt();
        int rate= in.nextInt();
        int time=in.nextInt();
        int si=(p*rate*time)/100;
        System.out.println(si);
    }
}
