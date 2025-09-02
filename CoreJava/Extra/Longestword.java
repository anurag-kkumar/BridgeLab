package CoreJava.Java_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Longestword {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String []arr=s.split(" ");
        String max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].length()>max.length()){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
