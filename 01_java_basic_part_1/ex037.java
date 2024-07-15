/*37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT*/


import java.util.Scanner;


public class ex037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String toReverseString = in.nextLine();
        String newString = "";
        for (int i = toReverseString.length() - 1; i >= 0; i--) {
            newString += toReverseString.charAt(i);
        }
        System.out.println(newString);
        in.close();
    }
}
