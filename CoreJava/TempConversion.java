package CoreJava;

import java.util.Scanner;

//Celsius to Fahrenheit Conversion
public class TempConversion {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int Celsius=in.nextInt();
                int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}
