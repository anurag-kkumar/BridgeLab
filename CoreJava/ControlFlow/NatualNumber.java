package CoreJava.ControlFlow;

import java.util.Scanner;

public class NatualNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 1) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + "  " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
