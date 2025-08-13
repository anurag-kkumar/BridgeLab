package CoreJava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius :");
        int radius= in.nextInt();
        double area=Math.pow(radius,2);
        double ans=3.14*area;
        System.out.println(ans);

    }
}
