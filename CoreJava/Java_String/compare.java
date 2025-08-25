package CoreJava.Java_String;

import java.util.Arrays;
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        System.out.println(isequal(s,t));

    }
    static boolean isequal(String s,String t){
        boolean ans=false;
        char[] array1= s.toCharArray();
        char[] array2 = t.toCharArray();
        for (int i = 0; i < array2.length; i++) {
            if(array2[i]==array1[i]){
                ans=true;
            }
            else {
                ans=false;
                break;
            }

        }
        return ans;
    }
}
