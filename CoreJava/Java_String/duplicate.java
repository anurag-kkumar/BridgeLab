package CoreJava.Java_String;

import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String output = duplicates(s);
        System.out.println( output);
    }
        public static String duplicates(String input) {
            if (input == null || input.length() == 0) {
                return input;
            }

            StringBuilder ans = new StringBuilder();
            char pChar = input.charAt(0);
            ans.append(pChar);

            for (int i = 1; i < input.length(); i++) {
                char cchar = input.charAt(i);
                if (cchar != pChar) {
                    ans.append(cchar);
                    pChar = cchar;
                }
            }

            return ans.toString();
        }


    }


