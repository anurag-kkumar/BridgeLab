package CoreJava.Java_String;

import java.util.Scanner;

public class NoOfVowels {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter  string ");
        String s=in.nextLine();
        System.out.println(noOfVowels(s));
    }
    static int noOfVowels(String s){
        s=s.toLowerCase();
        int c=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='e')
            {
                c++;
            }
        }

        return c;
    }
}
