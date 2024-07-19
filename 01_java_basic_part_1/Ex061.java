/*61. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd*/


import java.util.Scanner;


public class Ex061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversedStr.append(inputStr.charAt(i));
        }
        System.out.println(reversedStr);
        in.close();
    }
}