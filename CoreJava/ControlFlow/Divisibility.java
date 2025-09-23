package CoreJava.ControlFlow;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("num" + number + " divisible by 5? " + isDivisible);

    }
}