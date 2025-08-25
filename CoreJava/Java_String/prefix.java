package CoreJava.Java_String;

public class prefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println( prefix(input));
    }
        public static String prefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            return prefix;
        }


    }


