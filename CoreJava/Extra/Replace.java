package CoreJava.Java_String;

import java.util.Scanner;

public class Replace {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String oldsen = in.nextLine();
        String oword = in.nextLine();
        String nword = in.nextLine();

        String newsen = replaceword(oldsen, oword, nword);

        System.out.println("Original " + oldsen);
        System.out.println("new " + newsen);
    }
        public static String replaceword(String sentence, String oldWord, String newWord) {
            String[] words = sentence.split(" ");
            StringBuilder ans = new StringBuilder();
            for (String word : words) {
                if (word.equals(oldWord)) {
                    ans.append(newWord).append(" ");
                } else {
                    ans.append(word).append(" ");
                }
            }

            return ans.toString();
        }


    }


