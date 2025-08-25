package CoreJava.Java_String;

public class StringEqual {
    public static void main(String[] args) {
        String s="Anurag";
        String t="anurag";
        System.out.println(isequalCase_Sensitive(s,t));
        System.out.println(isequalCase_Insensitive(s,t));
    }
    static boolean isequalCase_Sensitive(String s,String t){
        s=s.toUpperCase();
        t=t.toUpperCase();

        return s.equals(t);
    }
    static boolean isequalCase_Insensitive(String s,String t){
        return s.equals(t);
    }
}
