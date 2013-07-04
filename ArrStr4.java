
// 1.4 - Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end of the string to hold additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

class ArrStr4 {

    public static void main(String[] args) {

        String s1 = "The quick brown fox jumps over the lazy dog.";

        replaceSpaces(s1);

    }

    public static void replaceSpaces(String s1) {

        int numSpaces = 0;
        
        // convert string to char array
        char[] strCharArr = s1.toCharArray();

        for(char c : strCharArr) {

            if(c == ' ') {

                ++numSpaces;
                
            }

        }

        char[] newCharArr = new char[strCharArr.length + (numSpaces*2)];

        for(int i = 0, j = 0; i < strCharArr.length; ++i) {

            if(strCharArr[i] == ' ') {

                newCharArr[j++] = '%';
                newCharArr[j++] = '2';
                newCharArr[j++] = '0';

            } else {

                newCharArr[j++] = strCharArr[i];
                
            }

        }

        System.out.println(new String(newCharArr));

    }

}
