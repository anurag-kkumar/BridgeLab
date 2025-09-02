package CoreJava.Java_String;
public class ReverseString {

        public static void main(String[] args) {
            String Str = "Hello World";
            String revs = "";
            for (int i = Str.length() - 1; i >= 0; i--) {
                revs += Str.charAt(i);
            }

            System.out.println("Og String: " + Str);
            System.out.println("Reversed String: " + revs);
        }
    }


