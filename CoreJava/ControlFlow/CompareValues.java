package CoreJava.ControlFlow;

import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("first number: ");
        int n1 = in.nextInt();

        System.out.print("second number: ");
        int n2 = in.nextInt();
        System.out.print("third number: ");
        int n3 = in.nextInt();

        boolean isFirstSmallest = (n1 < n2) && (n1 < n3);

        boolean firstLargest = (n1 > n2) && (n1 > n3);
        boolean secondLargest = (n2 > n1) && (n2 > n3);
        boolean thirdLargest = (n3 > n1) && (n3 > n2);
        System.out.println(isFirstSmallest);
        System.out.println(firstLargest);
        System.out.println( secondLargest);
        System.out.println(thirdLargest);

}
}
