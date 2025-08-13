package CoreJava;

import java.util.Scanner;

//Volume of a Cylinder
public class Volume {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int r= in.nextInt();
        int h=in.nextInt();
        double vol=(3.12)*(Math.pow(r,2))*h;
        System.out.println(vol);
    }
}
