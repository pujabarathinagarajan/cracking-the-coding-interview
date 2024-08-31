public class StringCompression {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // If next character is different than current, append this char to result
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        // Return the original string if compressed version is not smaller
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input1 = "aabcccccaaa";
        System.out.println(compress(input1)); // Output: "a2b1c5a3"

        String input2 = "abcd";
        System.out.println(compress(input2)); // Output: "abcd"
    }
}
