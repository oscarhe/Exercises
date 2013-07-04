import java.util.Arrays;

// 1.3 - Given two strings, write a method to decide if one is a permutation of the other.

class ArrStr2 {

    public static void main(String[] args) {

        // Assume whitespace matters and it is case sensitive
        String s1 = "abcdefg";
        String s2 = "gfedcba";
        String s3 = "abcd efg";
        String s4 = "Abcdefg";

        boolean test12 = compareStr(s1, s2);
        boolean test13 = compareStr(s1, s3);
        boolean test14 = compareStr(s1, s4);
        boolean test23 = compareStr(s2, s3);
        boolean test24 = compareStr(s2, s4);
        boolean test34 = compareStr(s3, s4);

    }

    public static boolean compareStr(String s1, String s2) {

        String str1 = sortStr(s1);
        String str2 = sortStr(s2);
        
        if(s1.length() == s2.length()) {
                
            if(str1.equals(str2)) {

                System.out.println(s1 + " and " + s2 + " are permutations of each other.");
                return true;

            } else {

                System.out.println(s1 + " and " + s2 + " are not permutations of each other.");
                return false;

            }
            
        } else {

            System.out.println(s1 + " and " + s2 + " are not permutations of each other.");
            return false;

        }

    }

    public static String sortStr(String s) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String result = new String(chars);
        
        return result;

    }

}
