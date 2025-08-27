package CoreJava;

import java.util.Scanner;
// Perimeter of a Rectangle
public class Perimeter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("length =");
        int l=in.nextInt();
        System.out.println("breath =");
        System.out.println();
        int w=in.nextInt();
        int perimeter=2*(l+w);
        System.out.println(perimeter);

    }
}
