package CoreJava.ControlFlow;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("number=  ");
        int a = in.nextInt();

        if (a > 0) {
            System.out.println("+ve");
        } else if (a< 0) {
            System.out.println("-ve");
        } else {
            System.out.println("zero");
        }

    }
}
