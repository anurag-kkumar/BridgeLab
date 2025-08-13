package CoreJava;

import java.util.Scanner;

public class PowerCalcuation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("base value :");
        int b= in.nextInt();
        System.out.println("pow :");
        int p=in.nextInt();
        System.out.println((int)Math.pow(b,p));
    }
}
