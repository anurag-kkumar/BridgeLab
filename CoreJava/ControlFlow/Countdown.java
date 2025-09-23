package CoreJava.ControlFlow;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

             System.out.print("start: ");
               int c = in.nextInt();
        while (c >= 1) {
              System.out.println(c);
              c--;
        }

    }
}
