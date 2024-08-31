package ArraysAndStrings;

public class URLify {
    public static String replaceSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(ch == ' '){
                result.append("%20");
            }else{
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println(output); // Output: "Mr%20John%20Smith"
    }
}
