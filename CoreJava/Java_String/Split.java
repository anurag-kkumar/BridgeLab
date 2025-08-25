package CoreJava.Java_String;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(Arrays.toString(split(s)));
    }
    static String [] split(String s){
        String []arr=new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=String.valueOf(s.charAt(i));
        }
        return arr;
    }
}
