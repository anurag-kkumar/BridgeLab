package CoreJava.Arrays;
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0.0;
        for (int i = 0; i < h.length; i++) {
            System.out.print(i + 1);
            h[i] = in.nextDouble();
            sum += h[i];
        }
        double mean = sum / h.length;
        System.out.println("Mean =" + mean);
    }
}

