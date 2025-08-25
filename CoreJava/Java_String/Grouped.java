package CoreJava.Java_String;

import java.util.Scanner;

public class Grouped {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two word >> ");
        String s = in.nextLine();
        String []s1=s.split(" ");
        System.out.println(isequal(s1[0],s1[1]));

    }
    static String isequal(String s,String t){
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
        return ans?"grouped" :"ungroped";
    }
}

