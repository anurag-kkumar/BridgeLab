package CoreJava.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolatesDistribute {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("no of child");
        int noOfChild=in.nextInt();
        System.out.println(" no of chocolet");
        int noOfChoclet=in.nextInt();
        System.out.println(Arrays.toString(findRemainderAndQuotient(noOfChoclet,noOfChild)));
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){

        int que=number/divisor;
        int rem=number%divisor;
        if(number<divisor){
            return new int[]{rem,que};
        }
        return new int[]{que,rem};
    }
}
