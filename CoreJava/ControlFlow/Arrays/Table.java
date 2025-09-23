package CoreJava.Arrays;
import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] t = new int[10];
        for (int i = 1; i <= 10; i++) {
            t[i - 1] = a * i;
            System.out.println(t[i - 1]);
        }

    }}