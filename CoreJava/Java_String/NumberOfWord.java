package CoreJava.Java_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWord {
    public static void main(String[] args) {
        int c=0;
        Scanner in =new Scanner(System.in);
        String s= in.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while (st.hasMoreTokens()) {
            c++;
           st.nextToken();

        }
        System.out.println(c);
    }
}
