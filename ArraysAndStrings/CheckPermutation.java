package ArraysAndStrings;

public class CheckPermutation {
    /* time complexity O(n) */
    public static boolean arePermutations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] charCounts = new int[128]; // Assuming ASCII character set
        
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i)]++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            charCounts[s2.charAt(i)]--;
            if (charCounts[s2.charAt(i)] < 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        System.out.println(arePermutations(s1, s2)); // true

        s1 = "hello";
        s2 = "world";
        
        System.out.println(arePermutations(s1, s2)); // false
    }
}
