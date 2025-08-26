package CoreJava.String;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        boolean ans=false;
        if(s1.length()!=s2.length())
        {System.out.println(false); return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                ans=true;
            }else {
                ans=false;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2); // it check weather referece point same obj or not
    }
}
