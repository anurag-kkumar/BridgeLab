package CoreJava.Java_String;

import java.util.Arrays;
import java.util.Scanner;

public class Contain {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        String t=in.nextLine();
        System.out.println(contain(s,t));
    }
    static boolean contain(String s,String c){
        String []arrs=s.split("");
        String []arrc=c.split("");
        Arrays.sort(arrs);
        Arrays.sort(arrc);
        boolean ans=false;
        for (int i = 0; i < arrc.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
//                System.out.println(arrs[i]);
                if(arrc[i].equals(arrs[j])){
                    ans=true;
                    break;
                }
                else {
                    ans=false;
                }
            }
            if(!ans){
                return ans;
            }
        }
        return ans;
    }
}
