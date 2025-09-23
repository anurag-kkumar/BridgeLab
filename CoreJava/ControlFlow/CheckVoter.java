package CoreJava.ControlFlow;

import java.util.Scanner;

public class CheckVoter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("The age is " + age + " and can vote.");
        } else {
            System.out.println("The age is " + age + " and cannot vote.");
        }

    }
}