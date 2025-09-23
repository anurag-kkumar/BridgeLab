package CoreJava.Arrays;
import java.util.Scanner;

public class Number_anlysis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print (i + 1);
            arr[i] = in.nextInt();
        }
        for (int i=0;i< arr.length;i++) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " +ve even ");
                } else {
                    System.out.println(i + " +ve odd ");
                }
            } else if (i < 0) {
                System.out.println(i + " is -ive.");
            } else {
                System.out.println(i + " is zero.");
            }   }
        if (arr[0] == arr[4]) {
              System.out.println("both first and last equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("first grater last");
        } else {
            System.out.println("first les than last.");
        }

    }
}
