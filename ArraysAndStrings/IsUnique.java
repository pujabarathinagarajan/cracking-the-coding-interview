package ArraysAndStrings;

import java.util.Arrays;

public class IsUnique {
    /* solution 1
     * brute force without additional data structure 
     * complexity 0(n^2)
     */
    public static boolean hasUniqueCharactersNoDS(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* solution 2
     * sort and find without additional data structure 
     * complexity 0(nlog(n))
     */
    public static boolean hasUniqueCharactersSorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //solution 1
        String test = "abcdefg";
        System.out.println(hasUniqueCharactersNoDS(test)); // true

        test = "abcdea";
        System.out.println(hasUniqueCharactersNoDS(test)); // false

        //solution 2
        test = "abcdefg";
        System.out.println(hasUniqueCharactersSorted(test)); // true

        test = "abcdea";
        System.out.println(hasUniqueCharactersSorted(test)); // false
    }
}
