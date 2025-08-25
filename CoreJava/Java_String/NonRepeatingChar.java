package CoreJava.Java_String;

import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any string");
        String s=in.nextLine();
        System.out.println(nonRepeatingChar(s));
    }
    static char nonRepeatingChar(String s){

        for (int i = 0; i < s.length(); i++) {

            String c= String.valueOf(s.charAt(i));
            String s1=s.substring(i+1);
            if(s1.contains(c)){
                return  c.charAt(0);
            }
        }
        return ' ';
    }
}
