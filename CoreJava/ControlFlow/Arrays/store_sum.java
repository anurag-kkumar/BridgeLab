package CoreJava.Arrays;
import java.util.Scanner;

public class store_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      double[] arrr = new double[10];
        double total = 0.0;

        int i = 0;
        while (true) {
            double a = in.nextDouble();
            if (a <= 0 || i >= 10) {
                break;
            }
                      arrr[i] = a;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(arrr[j]);
          total += arrr[j];
        }
                System.out.println(total);  }
}

