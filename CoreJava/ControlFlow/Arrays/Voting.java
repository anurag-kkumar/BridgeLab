package CoreJava.Arrays;
import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1);
            a[i] = in.nextInt();
             }
        for (int age : a) {
            if (age < 0) {
                System.out.println("wrong age");
            } else if (age >= 18) {
                System.out.println(age + " vote");
            } else {
                System.out.println( age + " not vote");
            }
                 }

    }
}
