package CoreJava;

import jdk.jshell.Snippet;

import java.util.Scanner;

//Convert Kilometers to Miles
public class Convert {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println( "enter kilometer : ");
        double k=in.nextDouble();
        System.out.println(k*0.621371);
    }
}
