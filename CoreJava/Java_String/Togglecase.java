package CoreJava.Java_String;

import java.util.Scanner;

public class Togglecase {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(togglecase(s));
    }
    static String togglecase(String s){
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }
           else if(sb.charAt(i)>90){
                int a=  (s.charAt(i)-32);

                sb.setCharAt(i,(char)a);
            }
            else {
                int a=  (s.charAt(i)+32);

                sb.setCharAt(i,(char)a);
            }
        }

        return String.valueOf(sb);
    }
}
