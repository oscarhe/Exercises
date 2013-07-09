// 1.8 - Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").

public class ArrStr8 {

    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s1Sub1 = "erbottlewat";
        String s1Sub2 = "botwatertle";

        isSubstring(s1, s1Sub1);
        isSubstring(s1, s1Sub2);

    }

    public static void isSubstring(String s, String subString) {

        String superString = s + s;

        if(superString.contains(subString)) {

            System.out.println(subString + " is a rotation of " + s);

        } else {

            System.out.println(subString + " is not a rotation of " + s);
        
        }

    }

}
