package CoreJava.Java_String;

import java.util.Scanner;

public class Comparess {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(compress(s));
    }
    static String compress(String s){
        String ans="";
        for (int i = 0; i <s.length() ; i++) {
            int c=0;

           if( i==s.length()-1||(s.charAt(i)!=s.charAt(i+1)) ){
               ans=ans+s.charAt(i);
            for (int j = 0; j <s.length() ; j++) {

                if(s.charAt(j)==s.charAt(i)){
                    c++;


                }
            }
            ans+=c;}
        }
        return ans;
    }
}
