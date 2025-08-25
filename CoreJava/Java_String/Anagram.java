package CoreJava.Java_String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String t= in.nextLine();
        System.out.println(anagram(s,t));
    }
    static boolean anagram(String s,String t){
        String []arr=s.split("");
        Arrays.sort(arr);
        String []arr1=t.split("");
        Arrays.sort(arr1);
       return Arrays.equals(arr1,arr);
    }
}
