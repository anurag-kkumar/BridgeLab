package CoreJava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=in.nextInt();
        System.out.println("enter 2st number");
        int b=in.nextInt();
        System.out.println("enter 3st number");
        int c=in.nextInt();
        System.out.println((double) (a+b+c)/3);

    }
}
