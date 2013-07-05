// 1.5 - Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string.

import java.util.Arrays;

class ArrStr5 {

    public static void main(String[] args) {

        String s1 = "aabcccccaaa";
        String s2 = "abcdefgabcdefg";
        String s3 = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbcdabbbbbbbbbbbbbbbbbbbbbbb";
        String s1Compressed = compress(s1);
        System.out.println(s1Compressed);
        String s2Compressed = compress(s2);
        System.out.println(s2Compressed);
        String s3Compressed = compress(s3);
        System.out.println(s3Compressed);
        

    }

    public static String compress(String s) {

        int compressedCount = countStr(s);

        if(compressedCount >= s.length()) {

            return s;

        } else {

            char[] charStr = new char[compressedCount];
            
            char current = s.charAt(0);
            int count = 1;
            int index = 0;

            for(int i = 1; i < s.length(); i++) {
                
                if(current == s.charAt(i)) {
                    
                    ++count;   
                    
                } else {

                    charStr[index++] = current;
                    for(int j = 0; j < String.valueOf(count).length(); j++) {

                        charStr[index++] = String.valueOf(count).charAt(j);
                        
                    }

                    current = s.charAt(i);
                    count = 1;

                }
                
            }

            charStr[index++] = current;
            for(int j = 0; j < String.valueOf(count).length(); j++) {

                charStr[index++] = String.valueOf(count).charAt(j);

            }

            return new String(charStr);

        }

    }

    public static int countStr(String s) {

        char current = s.charAt(0);        

        int count = 1;
        int size = 0;

        for(int i = 1; i < s.length(); i++) {

            if(current == s.charAt(i)) {

                ++count;

            } else {

                current = s.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
        
            }

        }

        size += 1 + String.valueOf(count).length();

        return size;

    }

}
