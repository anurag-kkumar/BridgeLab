package CoreJava.Level_1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("principal ,rate ,time  " );
        int principal=in.nextInt();
        int rate=in.nextInt();
        int time=in.nextInt();
      int ans=  calSimpleInterst(principal,rate,time);
        System.out.println(ans);
    }
    public  static int calSimpleInterst(int p,int r,int t){
        int si=0;
        si=(p+r+t)/100;
        return si;
    }
}
