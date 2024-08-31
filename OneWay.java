public class OneWay {
    public static boolean isOneEditAway(String s1, String s2) {
        // Check if the strings differ in length by more than 1
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        
        // Identify the shorter and longer string
        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longer = s1.length() < s2.length() ? s2 : s1;
        
        int index1 = 0; // Pointer for the shorter string
        int index2 = 0; // Pointer for the longer string
        boolean foundDifference = false;
        
        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                // Ensure that this is the first difference found
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                
                // If lengths are the same, move both pointers
                if (shorter.length() == longer.length()) {
                    index1++;
                }
            } else {
                // If matching, move the pointer for the shorter string
                index1++;
            }
            // Always move the pointer for the longer string
            index2++;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "ple"));   // true (one deletion)
        System.out.println(isOneEditAway("pales", "pale")); // true (one insertion)
        System.out.println(isOneEditAway("pale", "bale"));  // true (one replacement)
        System.out.println(isOneEditAway("pale", "bake"));  // false (two replacements)
        System.out.println(isOneEditAway("pale", "ake"));  // false (two replacements)
    }
}
