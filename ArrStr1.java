/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class ArrStr1 {
    public static void main(String[] args) {

        // Assuming this only applies to ASCII characters
        String s1 = "Hello World";
        String s2 = "ABCDEFG";
        String s3 = ",.;'GEF";

        isUnique(s1);
        isUnique(s2);
        isUnique(s3);
    
    }

    public static void isUnique(String s) {

        boolean[] allChars = new boolean[256];

        for(int i = 0; i < s.length(); i++) {

            if(allChars[s.charAt(i)] == true) { System.out.println(s + " does not contain all unique characters.");
                return;
            }
            allChars[s.charAt(i)] = true;

        }

        System.out.println(s + " does contain all unique characters.");

    }

}
