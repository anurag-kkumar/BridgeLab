package CoreJava.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class TrigonometricFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double degree = in.nextDouble();
        System.out.println(Arrays.toString(calculateTrigonometricFunctions(degree)));
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double []ans=new double[3];
        double radian = Math.toRadians(angle);
        ans[0] = Math.sin(radian);
        ans[1] =Math.cos(radian);
        ans[2] =Math.tan(radian);
        return ans;
    }
}