package CoreJava.Java_String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(length(s));


    }
    static int length(String s){
        int i=0;
        int c=0;
        boolean flag=true;
        while(flag){
        try{
            s.charAt(i);
            i++;
           c++;

        }
        catch (Exception e){
            flag=false;
        }
        }
      return c;
    }
}
