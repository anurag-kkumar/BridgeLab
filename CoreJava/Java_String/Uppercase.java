package CoreJava.Java_String;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="Anuraz";
        System.out.println(toUpperCase(s));
//        int c='b'-32;
////        System.out.println((char)c );
    }
    static String toUpperCase(String s){
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(sb.charAt(i)>90){
                int a=  (s.charAt(i)-32);

                sb.setCharAt(i,(char)a);
            }
        }

        return String.valueOf(sb);
    }
}
