public class PalindromePermutation {
    static boolean canFormPalindrome(String a) {
        int bitvector = 0, mask = 0;
        for (int i = 0; i < a.length(); i++) {
            int x = a.charAt(i) - 'a'; // Calculate position relative to 'a'
            mask = 1 << x; // Create a mask for the character
            bitvector = bitvector ^ mask; // Toggle the corresponding bit
        }
        // Check if at most one bit is set in the bitvector
        return (bitvector & (bitvector - 1)) == 0;
    }

    public static void main(String[] args) {
        String test1 = "tactcoa";
        System.out.println(canFormPalindrome(test1)); // true (can be rearranged to "taco cat")

        String test2 = "hello";
        System.out.println(canFormPalindrome(test2)); // false (cannot be rearranged to a palindrome)
    }
}
