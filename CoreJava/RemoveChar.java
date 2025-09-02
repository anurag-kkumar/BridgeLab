package CoreJava.Java_String;

public class RemoveChar {
        public static void main(String[] args) {
            String str = "Hello World";
            char charrev = 'l';
            String result = "";
            System.out.println( str);
     for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != charrev) {
                    result += str.charAt(i);
                }
            }


            System.out.println("Remove:" + charrev + "'");
            System.out.println("new String:" + result);
        }
    }


