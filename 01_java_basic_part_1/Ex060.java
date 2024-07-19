/*60. Write a Java program to find the penultimate (next to the last) word in a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy*/


public class Ex060 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println(penultimate(text));
    }

    private static String penultimate(String inputStr) {
        StringBuilder penultimate = new StringBuilder();
        int i = inputStr.length() - 1;
        for (int j = 0; j < 2; j++) {
            while (inputStr.charAt(i) != ' ') {
                i--;
            }
            i--;
        }
        i += 2;
        while (inputStr.charAt(i) != ' ') {
            penultimate.append(inputStr.charAt(i));
            i++;
        }
        return penultimate.toString();
    }
}