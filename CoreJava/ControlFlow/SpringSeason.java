package CoreJava.ControlFlow;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int m = in.nextInt();
        int d = in.nextInt();
        boolean spring = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20);
        if (spring) {
            System.out.println("spring");
        } else {
            System.out.println("not spring");
        }
    }
}

