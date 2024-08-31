public class StringRotation {
    /*
     * 
        Concatenate s1 with itself (i.e., s1 + s1).
        Check if s2 is a substring of the concatenated string.
     */
    public static boolean isRotation(String s1, String s2) {
        // Check if s1 and s2 are of the same length and not empty
        if (s1.length() == s2.length() && s1.length() > 0) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    // Assuming the existence of the isSubstring method
    public static boolean isSubstring(String str, String sub) {
        return str.contains(sub);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println(isRotation(s1, s2)); // true

        String s3 = "hello";
        String s4 = "llohe";

        System.out.println(isRotation(s3, s4)); // true

        String s5 = "hello";
        String s6 = "llheo";

        System.out.println(isRotation(s5, s6)); // false
    }
}
