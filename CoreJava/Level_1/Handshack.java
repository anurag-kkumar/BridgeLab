package CoreJava.Level_1;

import java.util.Scanner;

public class Handshack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("num of student");
        int num=in.nextInt();
        System.out.println(maximum_number_of_handshake(num));
    }
    public static int maximum_number_of_handshake(int num){
        int ans=(num*(num-1))/2;
        return ans;
    }
}
